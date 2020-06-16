package com.othmen.springtest.webmvc.test.async.controller;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

import javax.servlet.AsyncContext;
import javax.servlet.ServletRequest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

@RestController
@RequestMapping("/async1")
public class RestController1 {
	
	@RequestMapping("/get0")
	public String get0() {
		return "get0";
	}

	@RequestMapping("/get1")
	public DeferredResult<String> get1() {
		DeferredResult<String> deferredResult = new DeferredResult<String>();
		setResult(deferredResult, "asynch get1 ");
		return deferredResult;
	}

	private void setResult(DeferredResult<String> deferredResult, String string) {
		Callable<String> callable = new Callable<String>() {

			@Override
			public String call() throws Exception {
				Thread.currentThread().sleep(5000);
				deferredResult.setResult(string);
				return string;
			}
		};
		
		new Thread(new FutureTask<String>(callable)).start();
	}
	
	@RequestMapping("/get2")
	public Callable<String> get2(ServletRequest request) {
		Callable<String> callable = new Callable<String>() {

			@Override
			public String call() throws Exception {
				Thread.currentThread().sleep(5000);
				return "async get2";
			}
		};
		return callable;
	}
	
	@RequestMapping("/get3")
	public String get3(ServletRequest request) throws InterruptedException {
		AsyncContext asyncContext = request.startAsync();
		System.out.println("asyncContext.getTimeout() = " + asyncContext.getTimeout());
		Thread.currentThread().sleep(5000);
		return "async get3";
	}

	@RequestMapping("/get4")
	public ResponseBodyEmitter get4() {
		ResponseBodyEmitter responseBodyEmitter = new ResponseBodyEmitter();
		setResult2(responseBodyEmitter, "asynch get4");
		return responseBodyEmitter;
	}

	private void setResult2(ResponseBodyEmitter deferredResult, String string) {
		Callable<String> callable = new Callable<String>() {

			@Override
			public String call() throws Exception {
				Thread.currentThread().sleep(1000);
				deferredResult.send(string + "1");
				Thread.currentThread().sleep(1000);
				deferredResult.send(string + "2");
				Thread.currentThread().sleep(1000);
				deferredResult.send(string + "3");
				Thread.currentThread().sleep(1000);
				deferredResult.send(string + "4");
				Thread.currentThread().sleep(1000);
				deferredResult.send(string + "5");
				Thread.currentThread().sleep(1000);
				deferredResult.send(string + "6");
				Thread.currentThread().sleep(1000);
				deferredResult.send(string + "7");
				deferredResult.complete();
				return string;
			}
		};
		
		new Thread(new FutureTask<String>(callable)).start();
	}
	
	@GetMapping(path="/get5", produces=MediaType.TEXT_EVENT_STREAM_VALUE)
	public SseEmitter get5() {
	    SseEmitter emitter = new SseEmitter();
	    Callable<String> callable = new Callable<String>() {

			@Override
			public String call() throws Exception {
				Thread.currentThread().sleep(1000);
				emitter.send("get 5 " + "1");
				Thread.currentThread().sleep(1000);
				emitter.send("get 5 " + "2");
				Thread.currentThread().sleep(1000);
				emitter.send("get 5 " + "3");
				Thread.currentThread().sleep(1000);
				emitter.send("get 5 " + "4");
				Thread.currentThread().sleep(1000);
				emitter.send("get 5 " + "5");
				Thread.currentThread().sleep(1000);
				emitter.send("get 5 " + "6");
				Thread.currentThread().sleep(1000);
				emitter.send("get 5 " + "7");
				emitter.complete();
				return "get 5 ";
			}
		};
		new Thread(new FutureTask<String>(callable)).start();
	    
	    return emitter;
	}

	@RequestMapping("/get6")
	public Callable<String> get6(ServletRequest request) {
		Callable<String> callable = new Callable<String>() {

			@Override
			public String call() throws Exception {
				Thread.currentThread().sleep(5000);
				return "async get5";
			}
		};
		return callable;
	}
}
