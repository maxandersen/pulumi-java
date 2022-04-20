// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.awsnative.wafv2.inputs.LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs;
import com.pulumi.awsnative.wafv2.inputs.LoggingConfigurationFieldToMatchSingleHeaderPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A key-value pair to associate with a resource.
 * 
 */
public final class LoggingConfigurationFieldToMatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoggingConfigurationFieldToMatchArgs Empty = new LoggingConfigurationFieldToMatchArgs();

    /**
     * Inspect the request body as JSON. The request body immediately follows the request headers. This is the part of a request that contains any additional data that you want to send to your web server as the HTTP request body, such as data from a form.
     * 
     */
    @Import(name="jsonBody")
      private final @Nullable Output<LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs> jsonBody;

    public Output<LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs> jsonBody() {
        return this.jsonBody == null ? Codegen.empty() : this.jsonBody;
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @Import(name="method")
      private final @Nullable Output<Object> method;

    public Output<Object> method() {
        return this.method == null ? Codegen.empty() : this.method;
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a ? character, if any.
     * 
     */
    @Import(name="queryString")
      private final @Nullable Output<Object> queryString;

    public Output<Object> queryString() {
        return this.queryString == null ? Codegen.empty() : this.queryString;
    }

    /**
     * Inspect a single header. Provide the name of the header to inspect, for example, User-Agent or Referer. This setting isn&#39;t case sensitive.
     * 
     */
    @Import(name="singleHeader")
      private final @Nullable Output<LoggingConfigurationFieldToMatchSingleHeaderPropertiesArgs> singleHeader;

    public Output<LoggingConfigurationFieldToMatchSingleHeaderPropertiesArgs> singleHeader() {
        return this.singleHeader == null ? Codegen.empty() : this.singleHeader;
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, /images/daily-ad.jpg.
     * 
     */
    @Import(name="uriPath")
      private final @Nullable Output<Object> uriPath;

    public Output<Object> uriPath() {
        return this.uriPath == null ? Codegen.empty() : this.uriPath;
    }

    public LoggingConfigurationFieldToMatchArgs(
        @Nullable Output<LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs> jsonBody,
        @Nullable Output<Object> method,
        @Nullable Output<Object> queryString,
        @Nullable Output<LoggingConfigurationFieldToMatchSingleHeaderPropertiesArgs> singleHeader,
        @Nullable Output<Object> uriPath) {
        this.jsonBody = jsonBody;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.uriPath = uriPath;
    }

    private LoggingConfigurationFieldToMatchArgs() {
        this.jsonBody = Codegen.empty();
        this.method = Codegen.empty();
        this.queryString = Codegen.empty();
        this.singleHeader = Codegen.empty();
        this.uriPath = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfigurationFieldToMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs> jsonBody;
        private @Nullable Output<Object> method;
        private @Nullable Output<Object> queryString;
        private @Nullable Output<LoggingConfigurationFieldToMatchSingleHeaderPropertiesArgs> singleHeader;
        private @Nullable Output<Object> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingConfigurationFieldToMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jsonBody = defaults.jsonBody;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder jsonBody(@Nullable Output<LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs> jsonBody) {
            this.jsonBody = jsonBody;
            return this;
        }
        public Builder jsonBody(@Nullable LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs jsonBody) {
            this.jsonBody = Codegen.ofNullable(jsonBody);
            return this;
        }
        public Builder method(@Nullable Output<Object> method) {
            this.method = method;
            return this;
        }
        public Builder method(@Nullable Object method) {
            this.method = Codegen.ofNullable(method);
            return this;
        }
        public Builder queryString(@Nullable Output<Object> queryString) {
            this.queryString = queryString;
            return this;
        }
        public Builder queryString(@Nullable Object queryString) {
            this.queryString = Codegen.ofNullable(queryString);
            return this;
        }
        public Builder singleHeader(@Nullable Output<LoggingConfigurationFieldToMatchSingleHeaderPropertiesArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }
        public Builder singleHeader(@Nullable LoggingConfigurationFieldToMatchSingleHeaderPropertiesArgs singleHeader) {
            this.singleHeader = Codegen.ofNullable(singleHeader);
            return this;
        }
        public Builder uriPath(@Nullable Output<Object> uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public Builder uriPath(@Nullable Object uriPath) {
            this.uriPath = Codegen.ofNullable(uriPath);
            return this;
        }        public LoggingConfigurationFieldToMatchArgs build() {
            return new LoggingConfigurationFieldToMatchArgs(jsonBody, method, queryString, singleHeader, uriPath);
        }
    }
}
