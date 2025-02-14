// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DebugSessionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DebugSessionArgs Empty = new DebugSessionArgs();

    @Import(name="apiId", required=true)
    private Output<String> apiId;

    public Output<String> apiId() {
        return this.apiId;
    }

    /**
     * Optional. The number of request to be traced. Min = 1, Max = 15, Default = 10.
     * 
     */
    @Import(name="count")
    private @Nullable Output<Integer> count;

    /**
     * @return Optional. The number of request to be traced. Min = 1, Max = 15, Default = 10.
     * 
     */
    public Optional<Output<Integer>> count() {
        return Optional.ofNullable(this.count);
    }

    @Import(name="environmentId", required=true)
    private Output<String> environmentId;

    public Output<String> environmentId() {
        return this.environmentId;
    }

    /**
     * Optional. A conditional statement which is evaluated against the request message to determine if it should be traced. Syntax matches that of on API Proxy bundle flow Condition.
     * 
     */
    @Import(name="filter")
    private @Nullable Output<String> filter;

    /**
     * @return Optional. A conditional statement which is evaluated against the request message to determine if it should be traced. Syntax matches that of on API Proxy bundle flow Condition.
     * 
     */
    public Optional<Output<String>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * A unique ID for this DebugSession.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A unique ID for this DebugSession.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    public Output<String> organizationId() {
        return this.organizationId;
    }

    @Import(name="revisionId", required=true)
    private Output<String> revisionId;

    public Output<String> revisionId() {
        return this.revisionId;
    }

    /**
     * Optional. The time in seconds after which this DebugSession should end. This value will override the value in query param, if both are provided.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<String> timeout;

    /**
     * @return Optional. The time in seconds after which this DebugSession should end. This value will override the value in query param, if both are provided.
     * 
     */
    public Optional<Output<String>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    /**
     * Optional. The maximum number of bytes captured from the response payload. Min = 0, Max = 5120, Default = 5120.
     * 
     */
    @Import(name="tracesize")
    private @Nullable Output<Integer> tracesize;

    /**
     * @return Optional. The maximum number of bytes captured from the response payload. Min = 0, Max = 5120, Default = 5120.
     * 
     */
    public Optional<Output<Integer>> tracesize() {
        return Optional.ofNullable(this.tracesize);
    }

    /**
     * Optional. The length of time, in seconds, that this debug session is valid, starting from when it&#39;s received in the control plane. Min = 1, Max = 15, Default = 10.
     * 
     */
    @Import(name="validity")
    private @Nullable Output<Integer> validity;

    /**
     * @return Optional. The length of time, in seconds, that this debug session is valid, starting from when it&#39;s received in the control plane. Min = 1, Max = 15, Default = 10.
     * 
     */
    public Optional<Output<Integer>> validity() {
        return Optional.ofNullable(this.validity);
    }

    private DebugSessionArgs() {}

    private DebugSessionArgs(DebugSessionArgs $) {
        this.apiId = $.apiId;
        this.count = $.count;
        this.environmentId = $.environmentId;
        this.filter = $.filter;
        this.name = $.name;
        this.organizationId = $.organizationId;
        this.revisionId = $.revisionId;
        this.timeout = $.timeout;
        this.tracesize = $.tracesize;
        this.validity = $.validity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DebugSessionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DebugSessionArgs $;

        public Builder() {
            $ = new DebugSessionArgs();
        }

        public Builder(DebugSessionArgs defaults) {
            $ = new DebugSessionArgs(Objects.requireNonNull(defaults));
        }

        public Builder apiId(Output<String> apiId) {
            $.apiId = apiId;
            return this;
        }

        public Builder apiId(String apiId) {
            return apiId(Output.of(apiId));
        }

        /**
         * @param count Optional. The number of request to be traced. Min = 1, Max = 15, Default = 10.
         * 
         * @return builder
         * 
         */
        public Builder count(@Nullable Output<Integer> count) {
            $.count = count;
            return this;
        }

        /**
         * @param count Optional. The number of request to be traced. Min = 1, Max = 15, Default = 10.
         * 
         * @return builder
         * 
         */
        public Builder count(Integer count) {
            return count(Output.of(count));
        }

        public Builder environmentId(Output<String> environmentId) {
            $.environmentId = environmentId;
            return this;
        }

        public Builder environmentId(String environmentId) {
            return environmentId(Output.of(environmentId));
        }

        /**
         * @param filter Optional. A conditional statement which is evaluated against the request message to determine if it should be traced. Syntax matches that of on API Proxy bundle flow Condition.
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable Output<String> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter Optional. A conditional statement which is evaluated against the request message to determine if it should be traced. Syntax matches that of on API Proxy bundle flow Condition.
         * 
         * @return builder
         * 
         */
        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param name A unique ID for this DebugSession.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A unique ID for this DebugSession.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        public Builder revisionId(Output<String> revisionId) {
            $.revisionId = revisionId;
            return this;
        }

        public Builder revisionId(String revisionId) {
            return revisionId(Output.of(revisionId));
        }

        /**
         * @param timeout Optional. The time in seconds after which this DebugSession should end. This value will override the value in query param, if both are provided.
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<String> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout Optional. The time in seconds after which this DebugSession should end. This value will override the value in query param, if both are provided.
         * 
         * @return builder
         * 
         */
        public Builder timeout(String timeout) {
            return timeout(Output.of(timeout));
        }

        /**
         * @param tracesize Optional. The maximum number of bytes captured from the response payload. Min = 0, Max = 5120, Default = 5120.
         * 
         * @return builder
         * 
         */
        public Builder tracesize(@Nullable Output<Integer> tracesize) {
            $.tracesize = tracesize;
            return this;
        }

        /**
         * @param tracesize Optional. The maximum number of bytes captured from the response payload. Min = 0, Max = 5120, Default = 5120.
         * 
         * @return builder
         * 
         */
        public Builder tracesize(Integer tracesize) {
            return tracesize(Output.of(tracesize));
        }

        /**
         * @param validity Optional. The length of time, in seconds, that this debug session is valid, starting from when it&#39;s received in the control plane. Min = 1, Max = 15, Default = 10.
         * 
         * @return builder
         * 
         */
        public Builder validity(@Nullable Output<Integer> validity) {
            $.validity = validity;
            return this;
        }

        /**
         * @param validity Optional. The length of time, in seconds, that this debug session is valid, starting from when it&#39;s received in the control plane. Min = 1, Max = 15, Default = 10.
         * 
         * @return builder
         * 
         */
        public Builder validity(Integer validity) {
            return validity(Output.of(validity));
        }

        public DebugSessionArgs build() {
            $.apiId = Objects.requireNonNull($.apiId, "expected parameter 'apiId' to be non-null");
            $.environmentId = Objects.requireNonNull($.environmentId, "expected parameter 'environmentId' to be non-null");
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            $.revisionId = Objects.requireNonNull($.revisionId, "expected parameter 'revisionId' to be non-null");
            return $;
        }
    }

}
