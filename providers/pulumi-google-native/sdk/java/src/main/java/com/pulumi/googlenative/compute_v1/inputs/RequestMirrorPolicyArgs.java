// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A policy that specifies how requests intended for the route's backends are shadowed to a separate mirrored backend service. The load balancer doesn't wait for responses from the shadow service. Before sending traffic to the shadow service, the host or authority header is suffixed with -shadow.
 * 
 */
public final class RequestMirrorPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final RequestMirrorPolicyArgs Empty = new RequestMirrorPolicyArgs();

    /**
     * The full or partial URL to the BackendService resource being mirrored to.
     * 
     */
    @Import(name="backendService")
      private final @Nullable Output<String> backendService;

    public Output<String> backendService() {
        return this.backendService == null ? Codegen.empty() : this.backendService;
    }

    public RequestMirrorPolicyArgs(@Nullable Output<String> backendService) {
        this.backendService = backendService;
    }

    private RequestMirrorPolicyArgs() {
        this.backendService = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RequestMirrorPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> backendService;

        public Builder() {
    	      // Empty
        }

        public Builder(RequestMirrorPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendService = defaults.backendService;
        }

        public Builder backendService(@Nullable Output<String> backendService) {
            this.backendService = backendService;
            return this;
        }
        public Builder backendService(@Nullable String backendService) {
            this.backendService = Codegen.ofNullable(backendService);
            return this;
        }        public RequestMirrorPolicyArgs build() {
            return new RequestMirrorPolicyArgs(backendService);
        }
    }
}
