// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.pubsub_v1beta1a.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for a push delivery endpoint.
 * 
 */
public final class PushConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final PushConfigArgs Empty = new PushConfigArgs();

    /**
     * A URL locating the endpoint to which messages should be pushed. For example, a Webhook endpoint might use "https://example.com/push".
     * 
     */
    @Import(name="pushEndpoint")
      private final @Nullable Output<String> pushEndpoint;

    public Output<String> pushEndpoint() {
        return this.pushEndpoint == null ? Codegen.empty() : this.pushEndpoint;
    }

    public PushConfigArgs(@Nullable Output<String> pushEndpoint) {
        this.pushEndpoint = pushEndpoint;
    }

    private PushConfigArgs() {
        this.pushEndpoint = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PushConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> pushEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(PushConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pushEndpoint = defaults.pushEndpoint;
        }

        public Builder pushEndpoint(@Nullable Output<String> pushEndpoint) {
            this.pushEndpoint = pushEndpoint;
            return this;
        }
        public Builder pushEndpoint(@Nullable String pushEndpoint) {
            this.pushEndpoint = Codegen.ofNullable(pushEndpoint);
            return this;
        }        public PushConfigArgs build() {
            return new PushConfigArgs(pushEndpoint);
        }
    }
}
