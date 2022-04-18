// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.deploymentmanager_alpha.inputs.PollingOptionsArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Async options that determine when a resource should finish.
 * 
 */
public final class AsyncOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AsyncOptionsArgs Empty = new AsyncOptionsArgs();

    /**
     * Method regex where this policy will apply.
     * 
     */
    @Import(name="methodMatch")
      private final @Nullable Output<String> methodMatch;

    public Output<String> methodMatch() {
        return this.methodMatch == null ? Codegen.empty() : this.methodMatch;
    }

    /**
     * Deployment manager will poll instances for this API resource setting a RUNNING state, and blocking until polling conditions tell whether the resource is completed or failed.
     * 
     */
    @Import(name="pollingOptions")
      private final @Nullable Output<PollingOptionsArgs> pollingOptions;

    public Output<PollingOptionsArgs> pollingOptions() {
        return this.pollingOptions == null ? Codegen.empty() : this.pollingOptions;
    }

    public AsyncOptionsArgs(
        @Nullable Output<String> methodMatch,
        @Nullable Output<PollingOptionsArgs> pollingOptions) {
        this.methodMatch = methodMatch;
        this.pollingOptions = pollingOptions;
    }

    private AsyncOptionsArgs() {
        this.methodMatch = Codegen.empty();
        this.pollingOptions = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AsyncOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> methodMatch;
        private @Nullable Output<PollingOptionsArgs> pollingOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(AsyncOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.methodMatch = defaults.methodMatch;
    	      this.pollingOptions = defaults.pollingOptions;
        }

        public Builder methodMatch(@Nullable Output<String> methodMatch) {
            this.methodMatch = methodMatch;
            return this;
        }
        public Builder methodMatch(@Nullable String methodMatch) {
            this.methodMatch = Codegen.ofNullable(methodMatch);
            return this;
        }
        public Builder pollingOptions(@Nullable Output<PollingOptionsArgs> pollingOptions) {
            this.pollingOptions = pollingOptions;
            return this;
        }
        public Builder pollingOptions(@Nullable PollingOptionsArgs pollingOptions) {
            this.pollingOptions = Codegen.ofNullable(pollingOptions);
            return this;
        }        public AsyncOptionsArgs build() {
            return new AsyncOptionsArgs(methodMatch, pollingOptions);
        }
    }
}
