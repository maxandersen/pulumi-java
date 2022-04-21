// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Sftp read settings.
 * 
 */
public final class HttpReadSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final HttpReadSettingsArgs Empty = new HttpReadSettingsArgs();

    /**
     * The additional HTTP headers in the request to the RESTful API. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="additionalHeaders")
    private @Nullable Output<Object> additionalHeaders;

    public Optional<Output<Object>> additionalHeaders() {
        return Optional.ofNullable(this.additionalHeaders);
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
    private @Nullable Output<Object> disableMetricsCollection;

    public Optional<Output<Object>> disableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }

    /**
     * Indicates whether to enable partition discovery.
     * 
     */
    @Import(name="enablePartitionDiscovery")
    private @Nullable Output<Boolean> enablePartitionDiscovery;

    public Optional<Output<Boolean>> enablePartitionDiscovery() {
        return Optional.ofNullable(this.enablePartitionDiscovery);
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
    private @Nullable Output<Object> maxConcurrentConnections;

    public Optional<Output<Object>> maxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * Specify the root path where partition discovery starts from. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="partitionRootPath")
    private @Nullable Output<Object> partitionRootPath;

    public Optional<Output<Object>> partitionRootPath() {
        return Optional.ofNullable(this.partitionRootPath);
    }

    /**
     * The HTTP request body to the RESTful API if requestMethod is POST. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="requestBody")
    private @Nullable Output<Object> requestBody;

    public Optional<Output<Object>> requestBody() {
        return Optional.ofNullable(this.requestBody);
    }

    /**
     * The HTTP method used to call the RESTful API. The default is GET. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="requestMethod")
    private @Nullable Output<Object> requestMethod;

    public Optional<Output<Object>> requestMethod() {
        return Optional.ofNullable(this.requestMethod);
    }

    /**
     * Specifies the timeout for a HTTP client to get HTTP response from HTTP server.
     * 
     */
    @Import(name="requestTimeout")
    private @Nullable Output<Object> requestTimeout;

    public Optional<Output<Object>> requestTimeout() {
        return Optional.ofNullable(this.requestTimeout);
    }

    /**
     * The read setting type.
     * Expected value is &#39;HttpReadSettings&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private HttpReadSettingsArgs() {}

    private HttpReadSettingsArgs(HttpReadSettingsArgs $) {
        this.additionalHeaders = $.additionalHeaders;
        this.disableMetricsCollection = $.disableMetricsCollection;
        this.enablePartitionDiscovery = $.enablePartitionDiscovery;
        this.maxConcurrentConnections = $.maxConcurrentConnections;
        this.partitionRootPath = $.partitionRootPath;
        this.requestBody = $.requestBody;
        this.requestMethod = $.requestMethod;
        this.requestTimeout = $.requestTimeout;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpReadSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpReadSettingsArgs $;

        public Builder() {
            $ = new HttpReadSettingsArgs();
        }

        public Builder(HttpReadSettingsArgs defaults) {
            $ = new HttpReadSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder additionalHeaders(@Nullable Output<Object> additionalHeaders) {
            $.additionalHeaders = additionalHeaders;
            return this;
        }

        public Builder additionalHeaders(Object additionalHeaders) {
            return additionalHeaders(Output.of(additionalHeaders));
        }

        public Builder disableMetricsCollection(@Nullable Output<Object> disableMetricsCollection) {
            $.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder disableMetricsCollection(Object disableMetricsCollection) {
            return disableMetricsCollection(Output.of(disableMetricsCollection));
        }

        public Builder enablePartitionDiscovery(@Nullable Output<Boolean> enablePartitionDiscovery) {
            $.enablePartitionDiscovery = enablePartitionDiscovery;
            return this;
        }

        public Builder enablePartitionDiscovery(Boolean enablePartitionDiscovery) {
            return enablePartitionDiscovery(Output.of(enablePartitionDiscovery));
        }

        public Builder maxConcurrentConnections(@Nullable Output<Object> maxConcurrentConnections) {
            $.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder maxConcurrentConnections(Object maxConcurrentConnections) {
            return maxConcurrentConnections(Output.of(maxConcurrentConnections));
        }

        public Builder partitionRootPath(@Nullable Output<Object> partitionRootPath) {
            $.partitionRootPath = partitionRootPath;
            return this;
        }

        public Builder partitionRootPath(Object partitionRootPath) {
            return partitionRootPath(Output.of(partitionRootPath));
        }

        public Builder requestBody(@Nullable Output<Object> requestBody) {
            $.requestBody = requestBody;
            return this;
        }

        public Builder requestBody(Object requestBody) {
            return requestBody(Output.of(requestBody));
        }

        public Builder requestMethod(@Nullable Output<Object> requestMethod) {
            $.requestMethod = requestMethod;
            return this;
        }

        public Builder requestMethod(Object requestMethod) {
            return requestMethod(Output.of(requestMethod));
        }

        public Builder requestTimeout(@Nullable Output<Object> requestTimeout) {
            $.requestTimeout = requestTimeout;
            return this;
        }

        public Builder requestTimeout(Object requestTimeout) {
            return requestTimeout(Output.of(requestTimeout));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public HttpReadSettingsArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
