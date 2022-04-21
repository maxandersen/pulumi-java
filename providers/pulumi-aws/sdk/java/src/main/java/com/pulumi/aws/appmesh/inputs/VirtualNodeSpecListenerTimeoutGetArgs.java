// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutGrpcGetArgs;
import com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutHttp2GetArgs;
import com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutHttpGetArgs;
import com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutTcpGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNodeSpecListenerTimeoutGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerTimeoutGetArgs Empty = new VirtualNodeSpecListenerTimeoutGetArgs();

    /**
     * Timeouts for gRPC listeners.
     * 
     */
    @Import(name="grpc")
    private @Nullable Output<VirtualNodeSpecListenerTimeoutGrpcGetArgs> grpc;

    public Optional<Output<VirtualNodeSpecListenerTimeoutGrpcGetArgs>> grpc() {
        return Optional.ofNullable(this.grpc);
    }

    /**
     * Timeouts for HTTP listeners.
     * 
     */
    @Import(name="http")
    private @Nullable Output<VirtualNodeSpecListenerTimeoutHttpGetArgs> http;

    public Optional<Output<VirtualNodeSpecListenerTimeoutHttpGetArgs>> http() {
        return Optional.ofNullable(this.http);
    }

    /**
     * Timeouts for HTTP2 listeners.
     * 
     */
    @Import(name="http2")
    private @Nullable Output<VirtualNodeSpecListenerTimeoutHttp2GetArgs> http2;

    public Optional<Output<VirtualNodeSpecListenerTimeoutHttp2GetArgs>> http2() {
        return Optional.ofNullable(this.http2);
    }

    /**
     * Timeouts for TCP listeners.
     * 
     */
    @Import(name="tcp")
    private @Nullable Output<VirtualNodeSpecListenerTimeoutTcpGetArgs> tcp;

    public Optional<Output<VirtualNodeSpecListenerTimeoutTcpGetArgs>> tcp() {
        return Optional.ofNullable(this.tcp);
    }

    private VirtualNodeSpecListenerTimeoutGetArgs() {}

    private VirtualNodeSpecListenerTimeoutGetArgs(VirtualNodeSpecListenerTimeoutGetArgs $) {
        this.grpc = $.grpc;
        this.http = $.http;
        this.http2 = $.http2;
        this.tcp = $.tcp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNodeSpecListenerTimeoutGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeSpecListenerTimeoutGetArgs $;

        public Builder() {
            $ = new VirtualNodeSpecListenerTimeoutGetArgs();
        }

        public Builder(VirtualNodeSpecListenerTimeoutGetArgs defaults) {
            $ = new VirtualNodeSpecListenerTimeoutGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder grpc(@Nullable Output<VirtualNodeSpecListenerTimeoutGrpcGetArgs> grpc) {
            $.grpc = grpc;
            return this;
        }

        public Builder grpc(VirtualNodeSpecListenerTimeoutGrpcGetArgs grpc) {
            return grpc(Output.of(grpc));
        }

        public Builder http(@Nullable Output<VirtualNodeSpecListenerTimeoutHttpGetArgs> http) {
            $.http = http;
            return this;
        }

        public Builder http(VirtualNodeSpecListenerTimeoutHttpGetArgs http) {
            return http(Output.of(http));
        }

        public Builder http2(@Nullable Output<VirtualNodeSpecListenerTimeoutHttp2GetArgs> http2) {
            $.http2 = http2;
            return this;
        }

        public Builder http2(VirtualNodeSpecListenerTimeoutHttp2GetArgs http2) {
            return http2(Output.of(http2));
        }

        public Builder tcp(@Nullable Output<VirtualNodeSpecListenerTimeoutTcpGetArgs> tcp) {
            $.tcp = tcp;
            return this;
        }

        public Builder tcp(VirtualNodeSpecListenerTimeoutTcpGetArgs tcp) {
            return tcp(Output.of(tcp));
        }

        public VirtualNodeSpecListenerTimeoutGetArgs build() {
            return $;
        }
    }

}
