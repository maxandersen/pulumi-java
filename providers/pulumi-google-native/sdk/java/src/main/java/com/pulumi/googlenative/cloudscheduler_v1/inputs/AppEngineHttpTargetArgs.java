// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudscheduler_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudscheduler_v1.enums.AppEngineHttpTargetHttpMethod;
import com.pulumi.googlenative.cloudscheduler_v1.inputs.AppEngineRoutingArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * App Engine target. The job will be pushed to a job handler by means of an HTTP request via an http_method such as HTTP POST, HTTP GET, etc. The job is acknowledged by means of an HTTP response code in the range [200 - 299]. Error 503 is considered an App Engine system error instead of an application error. Requests returning error 503 will be retried regardless of retry configuration and not counted against retry counts. Any other response code, or a failure to receive a response before the deadline, constitutes a failed attempt.
 * 
 */
public final class AppEngineHttpTargetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppEngineHttpTargetArgs Empty = new AppEngineHttpTargetArgs();

    /**
     * App Engine Routing setting for the job.
     * 
     */
    @Import(name="appEngineRouting")
    private @Nullable Output<AppEngineRoutingArgs> appEngineRouting;

    /**
     * @return App Engine Routing setting for the job.
     * 
     */
    public Optional<Output<AppEngineRoutingArgs>> appEngineRouting() {
        return Optional.ofNullable(this.appEngineRouting);
    }

    /**
     * Body. HTTP request body. A request body is allowed only if the HTTP method is POST or PUT. It will result in invalid argument error to set a body on a job with an incompatible HttpMethod.
     * 
     */
    @Import(name="body")
    private @Nullable Output<String> body;

    /**
     * @return Body. HTTP request body. A request body is allowed only if the HTTP method is POST or PUT. It will result in invalid argument error to set a body on a job with an incompatible HttpMethod.
     * 
     */
    public Optional<Output<String>> body() {
        return Optional.ofNullable(this.body);
    }

    /**
     * HTTP request headers. This map contains the header field names and values. Headers can be set when the job is created. Cloud Scheduler sets some headers to default values: * `User-Agent`: By default, this header is `&#34;AppEngine-Google; (+http://code.google.com/appengine)&#34;`. This header can be modified, but Cloud Scheduler will append `&#34;AppEngine-Google; (+http://code.google.com/appengine)&#34;` to the modified `User-Agent`. * `X-CloudScheduler`: This header will be set to true. * `X-CloudScheduler-JobName`: This header will contain the job name. * `X-CloudScheduler-ScheduleTime`: For Cloud Scheduler jobs specified in the unix-cron format, this header will contain the job schedule time in RFC3339 UTC &#34;Zulu&#34; format. If the job has an body, Cloud Scheduler sets the following headers: * `Content-Type`: By default, the `Content-Type` header is set to `&#34;application/octet-stream&#34;`. The default can be overridden by explictly setting `Content-Type` to a particular media type when the job is created. For example, `Content-Type` can be set to `&#34;application/json&#34;`. * `Content-Length`: This is computed by Cloud Scheduler. This value is output only. It cannot be changed. The headers below are output only. They cannot be set or overridden: * `X-Google-*`: For Google internal use only. * `X-AppEngine-*`: For Google internal use only. In addition, some App Engine headers, which contain job-specific information, are also be sent to the job handler.
     * 
     */
    @Import(name="headers")
    private @Nullable Output<Map<String,String>> headers;

    /**
     * @return HTTP request headers. This map contains the header field names and values. Headers can be set when the job is created. Cloud Scheduler sets some headers to default values: * `User-Agent`: By default, this header is `&#34;AppEngine-Google; (+http://code.google.com/appengine)&#34;`. This header can be modified, but Cloud Scheduler will append `&#34;AppEngine-Google; (+http://code.google.com/appengine)&#34;` to the modified `User-Agent`. * `X-CloudScheduler`: This header will be set to true. * `X-CloudScheduler-JobName`: This header will contain the job name. * `X-CloudScheduler-ScheduleTime`: For Cloud Scheduler jobs specified in the unix-cron format, this header will contain the job schedule time in RFC3339 UTC &#34;Zulu&#34; format. If the job has an body, Cloud Scheduler sets the following headers: * `Content-Type`: By default, the `Content-Type` header is set to `&#34;application/octet-stream&#34;`. The default can be overridden by explictly setting `Content-Type` to a particular media type when the job is created. For example, `Content-Type` can be set to `&#34;application/json&#34;`. * `Content-Length`: This is computed by Cloud Scheduler. This value is output only. It cannot be changed. The headers below are output only. They cannot be set or overridden: * `X-Google-*`: For Google internal use only. * `X-AppEngine-*`: For Google internal use only. In addition, some App Engine headers, which contain job-specific information, are also be sent to the job handler.
     * 
     */
    public Optional<Output<Map<String,String>>> headers() {
        return Optional.ofNullable(this.headers);
    }

    /**
     * The HTTP method to use for the request. PATCH and OPTIONS are not permitted.
     * 
     */
    @Import(name="httpMethod")
    private @Nullable Output<AppEngineHttpTargetHttpMethod> httpMethod;

    /**
     * @return The HTTP method to use for the request. PATCH and OPTIONS are not permitted.
     * 
     */
    public Optional<Output<AppEngineHttpTargetHttpMethod>> httpMethod() {
        return Optional.ofNullable(this.httpMethod);
    }

    /**
     * The relative URI. The relative URL must begin with &#34;/&#34; and must be a valid HTTP relative URL. It can contain a path, query string arguments, and `#` fragments. If the relative URL is empty, then the root path &#34;/&#34; will be used. No spaces are allowed, and the maximum length allowed is 2083 characters.
     * 
     */
    @Import(name="relativeUri")
    private @Nullable Output<String> relativeUri;

    /**
     * @return The relative URI. The relative URL must begin with &#34;/&#34; and must be a valid HTTP relative URL. It can contain a path, query string arguments, and `#` fragments. If the relative URL is empty, then the root path &#34;/&#34; will be used. No spaces are allowed, and the maximum length allowed is 2083 characters.
     * 
     */
    public Optional<Output<String>> relativeUri() {
        return Optional.ofNullable(this.relativeUri);
    }

    private AppEngineHttpTargetArgs() {}

    private AppEngineHttpTargetArgs(AppEngineHttpTargetArgs $) {
        this.appEngineRouting = $.appEngineRouting;
        this.body = $.body;
        this.headers = $.headers;
        this.httpMethod = $.httpMethod;
        this.relativeUri = $.relativeUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppEngineHttpTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppEngineHttpTargetArgs $;

        public Builder() {
            $ = new AppEngineHttpTargetArgs();
        }

        public Builder(AppEngineHttpTargetArgs defaults) {
            $ = new AppEngineHttpTargetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appEngineRouting App Engine Routing setting for the job.
         * 
         * @return builder
         * 
         */
        public Builder appEngineRouting(@Nullable Output<AppEngineRoutingArgs> appEngineRouting) {
            $.appEngineRouting = appEngineRouting;
            return this;
        }

        /**
         * @param appEngineRouting App Engine Routing setting for the job.
         * 
         * @return builder
         * 
         */
        public Builder appEngineRouting(AppEngineRoutingArgs appEngineRouting) {
            return appEngineRouting(Output.of(appEngineRouting));
        }

        /**
         * @param body Body. HTTP request body. A request body is allowed only if the HTTP method is POST or PUT. It will result in invalid argument error to set a body on a job with an incompatible HttpMethod.
         * 
         * @return builder
         * 
         */
        public Builder body(@Nullable Output<String> body) {
            $.body = body;
            return this;
        }

        /**
         * @param body Body. HTTP request body. A request body is allowed only if the HTTP method is POST or PUT. It will result in invalid argument error to set a body on a job with an incompatible HttpMethod.
         * 
         * @return builder
         * 
         */
        public Builder body(String body) {
            return body(Output.of(body));
        }

        /**
         * @param headers HTTP request headers. This map contains the header field names and values. Headers can be set when the job is created. Cloud Scheduler sets some headers to default values: * `User-Agent`: By default, this header is `&#34;AppEngine-Google; (+http://code.google.com/appengine)&#34;`. This header can be modified, but Cloud Scheduler will append `&#34;AppEngine-Google; (+http://code.google.com/appengine)&#34;` to the modified `User-Agent`. * `X-CloudScheduler`: This header will be set to true. * `X-CloudScheduler-JobName`: This header will contain the job name. * `X-CloudScheduler-ScheduleTime`: For Cloud Scheduler jobs specified in the unix-cron format, this header will contain the job schedule time in RFC3339 UTC &#34;Zulu&#34; format. If the job has an body, Cloud Scheduler sets the following headers: * `Content-Type`: By default, the `Content-Type` header is set to `&#34;application/octet-stream&#34;`. The default can be overridden by explictly setting `Content-Type` to a particular media type when the job is created. For example, `Content-Type` can be set to `&#34;application/json&#34;`. * `Content-Length`: This is computed by Cloud Scheduler. This value is output only. It cannot be changed. The headers below are output only. They cannot be set or overridden: * `X-Google-*`: For Google internal use only. * `X-AppEngine-*`: For Google internal use only. In addition, some App Engine headers, which contain job-specific information, are also be sent to the job handler.
         * 
         * @return builder
         * 
         */
        public Builder headers(@Nullable Output<Map<String,String>> headers) {
            $.headers = headers;
            return this;
        }

        /**
         * @param headers HTTP request headers. This map contains the header field names and values. Headers can be set when the job is created. Cloud Scheduler sets some headers to default values: * `User-Agent`: By default, this header is `&#34;AppEngine-Google; (+http://code.google.com/appengine)&#34;`. This header can be modified, but Cloud Scheduler will append `&#34;AppEngine-Google; (+http://code.google.com/appengine)&#34;` to the modified `User-Agent`. * `X-CloudScheduler`: This header will be set to true. * `X-CloudScheduler-JobName`: This header will contain the job name. * `X-CloudScheduler-ScheduleTime`: For Cloud Scheduler jobs specified in the unix-cron format, this header will contain the job schedule time in RFC3339 UTC &#34;Zulu&#34; format. If the job has an body, Cloud Scheduler sets the following headers: * `Content-Type`: By default, the `Content-Type` header is set to `&#34;application/octet-stream&#34;`. The default can be overridden by explictly setting `Content-Type` to a particular media type when the job is created. For example, `Content-Type` can be set to `&#34;application/json&#34;`. * `Content-Length`: This is computed by Cloud Scheduler. This value is output only. It cannot be changed. The headers below are output only. They cannot be set or overridden: * `X-Google-*`: For Google internal use only. * `X-AppEngine-*`: For Google internal use only. In addition, some App Engine headers, which contain job-specific information, are also be sent to the job handler.
         * 
         * @return builder
         * 
         */
        public Builder headers(Map<String,String> headers) {
            return headers(Output.of(headers));
        }

        /**
         * @param httpMethod The HTTP method to use for the request. PATCH and OPTIONS are not permitted.
         * 
         * @return builder
         * 
         */
        public Builder httpMethod(@Nullable Output<AppEngineHttpTargetHttpMethod> httpMethod) {
            $.httpMethod = httpMethod;
            return this;
        }

        /**
         * @param httpMethod The HTTP method to use for the request. PATCH and OPTIONS are not permitted.
         * 
         * @return builder
         * 
         */
        public Builder httpMethod(AppEngineHttpTargetHttpMethod httpMethod) {
            return httpMethod(Output.of(httpMethod));
        }

        /**
         * @param relativeUri The relative URI. The relative URL must begin with &#34;/&#34; and must be a valid HTTP relative URL. It can contain a path, query string arguments, and `#` fragments. If the relative URL is empty, then the root path &#34;/&#34; will be used. No spaces are allowed, and the maximum length allowed is 2083 characters.
         * 
         * @return builder
         * 
         */
        public Builder relativeUri(@Nullable Output<String> relativeUri) {
            $.relativeUri = relativeUri;
            return this;
        }

        /**
         * @param relativeUri The relative URI. The relative URL must begin with &#34;/&#34; and must be a valid HTTP relative URL. It can contain a path, query string arguments, and `#` fragments. If the relative URL is empty, then the root path &#34;/&#34; will be used. No spaces are allowed, and the maximum length allowed is 2083 characters.
         * 
         * @return builder
         * 
         */
        public Builder relativeUri(String relativeUri) {
            return relativeUri(Output.of(relativeUri));
        }

        public AppEngineHttpTargetArgs build() {
            return $;
        }
    }

}
