// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.node.k8s.io_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OverheadArgs extends io.pulumi.resources.ResourceArgs {

    public static final OverheadArgs Empty = new OverheadArgs();

    @InputImport(name="podFixed")
    private final @Nullable Input<Map<String,String>> podFixed;

    public Input<Map<String,String>> getPodFixed() {
        return this.podFixed == null ? Input.empty() : this.podFixed;
    }

    public OverheadArgs(@Nullable Input<Map<String,String>> podFixed) {
        this.podFixed = podFixed;
    }

    private OverheadArgs() {
        this.podFixed = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OverheadArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> podFixed;

        public Builder() {
    	      // Empty
        }

        public Builder(OverheadArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.podFixed = defaults.podFixed;
        }

        public Builder setPodFixed(@Nullable Input<Map<String,String>> podFixed) {
            this.podFixed = podFixed;
            return this;
        }

        public Builder setPodFixed(@Nullable Map<String,String> podFixed) {
            this.podFixed = Input.ofNullable(podFixed);
            return this;
        }

        public OverheadArgs build() {
            return new OverheadArgs(podFixed);
        }
    }
}
