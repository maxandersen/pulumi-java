// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.discovery.k8s.io_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EndpointConditionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointConditionsArgs Empty = new EndpointConditionsArgs();

    @InputImport(name="ready")
    private final @Nullable Input<Boolean> ready;

    public Input<Boolean> getReady() {
        return this.ready == null ? Input.empty() : this.ready;
    }

    @InputImport(name="serving")
    private final @Nullable Input<Boolean> serving;

    public Input<Boolean> getServing() {
        return this.serving == null ? Input.empty() : this.serving;
    }

    @InputImport(name="terminating")
    private final @Nullable Input<Boolean> terminating;

    public Input<Boolean> getTerminating() {
        return this.terminating == null ? Input.empty() : this.terminating;
    }

    public EndpointConditionsArgs(
        @Nullable Input<Boolean> ready,
        @Nullable Input<Boolean> serving,
        @Nullable Input<Boolean> terminating) {
        this.ready = ready;
        this.serving = serving;
        this.terminating = terminating;
    }

    private EndpointConditionsArgs() {
        this.ready = Input.empty();
        this.serving = Input.empty();
        this.terminating = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointConditionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> ready;
        private @Nullable Input<Boolean> serving;
        private @Nullable Input<Boolean> terminating;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointConditionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ready = defaults.ready;
    	      this.serving = defaults.serving;
    	      this.terminating = defaults.terminating;
        }

        public Builder setReady(@Nullable Input<Boolean> ready) {
            this.ready = ready;
            return this;
        }

        public Builder setReady(@Nullable Boolean ready) {
            this.ready = Input.ofNullable(ready);
            return this;
        }

        public Builder setServing(@Nullable Input<Boolean> serving) {
            this.serving = serving;
            return this;
        }

        public Builder setServing(@Nullable Boolean serving) {
            this.serving = Input.ofNullable(serving);
            return this;
        }

        public Builder setTerminating(@Nullable Input<Boolean> terminating) {
            this.terminating = terminating;
            return this;
        }

        public Builder setTerminating(@Nullable Boolean terminating) {
            this.terminating = Input.ofNullable(terminating);
            return this;
        }

        public EndpointConditionsArgs build() {
            return new EndpointConditionsArgs(ready, serving, terminating);
        }
    }
}
