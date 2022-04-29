// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerinstance.inputs;

import com.pulumi.azurenative.containerinstance.enums.Scheme;
import com.pulumi.azurenative.containerinstance.inputs.HttpHeadersArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The container Http Get settings, for liveness or readiness probe
 * 
 */
public final class ContainerHttpGetArgs extends ResourceArgs {

    public static final ContainerHttpGetArgs Empty = new ContainerHttpGetArgs();

    /**
     * The HTTP headers.
     * 
     */
    @Import(name="httpHeaders")
    private @Nullable Output<HttpHeadersArgs> httpHeaders;

    /**
     * @return The HTTP headers.
     * 
     */
    public Optional<Output<HttpHeadersArgs>> httpHeaders() {
        return Optional.ofNullable(this.httpHeaders);
    }

    /**
     * The path to probe.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return The path to probe.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * The port number to probe.
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    /**
     * @return The port number to probe.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }

    /**
     * The scheme.
     * 
     */
    @Import(name="scheme")
    private @Nullable Output<Either<String,Scheme>> scheme;

    /**
     * @return The scheme.
     * 
     */
    public Optional<Output<Either<String,Scheme>>> scheme() {
        return Optional.ofNullable(this.scheme);
    }

    private ContainerHttpGetArgs() {}

    private ContainerHttpGetArgs(ContainerHttpGetArgs $) {
        this.httpHeaders = $.httpHeaders;
        this.path = $.path;
        this.port = $.port;
        this.scheme = $.scheme;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerHttpGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerHttpGetArgs $;

        public Builder() {
            $ = new ContainerHttpGetArgs();
        }

        public Builder(ContainerHttpGetArgs defaults) {
            $ = new ContainerHttpGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param httpHeaders The HTTP headers.
         * 
         * @return builder
         * 
         */
        public Builder httpHeaders(@Nullable Output<HttpHeadersArgs> httpHeaders) {
            $.httpHeaders = httpHeaders;
            return this;
        }

        /**
         * @param httpHeaders The HTTP headers.
         * 
         * @return builder
         * 
         */
        public Builder httpHeaders(HttpHeadersArgs httpHeaders) {
            return httpHeaders(Output.of(httpHeaders));
        }

        /**
         * @param path The path to probe.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The path to probe.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param port The port number to probe.
         * 
         * @return builder
         * 
         */
        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port number to probe.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param scheme The scheme.
         * 
         * @return builder
         * 
         */
        public Builder scheme(@Nullable Output<Either<String,Scheme>> scheme) {
            $.scheme = scheme;
            return this;
        }

        /**
         * @param scheme The scheme.
         * 
         * @return builder
         * 
         */
        public Builder scheme(Either<String,Scheme> scheme) {
            return scheme(Output.of(scheme));
        }

        /**
         * @param scheme The scheme.
         * 
         * @return builder
         * 
         */
        public Builder scheme(String scheme) {
            return scheme(Either.ofLeft(scheme));
        }

        /**
         * @param scheme The scheme.
         * 
         * @return builder
         * 
         */
        public Builder scheme(Scheme scheme) {
            return scheme(Either.ofRight(scheme));
        }

        public ContainerHttpGetArgs build() {
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            return $;
        }
    }

}
