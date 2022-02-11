// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomResourceSubresourceScaleArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomResourceSubresourceScaleArgs Empty = new CustomResourceSubresourceScaleArgs();

    @InputImport(name="labelSelectorPath")
    private final @Nullable Input<String> labelSelectorPath;

    public Input<String> getLabelSelectorPath() {
        return this.labelSelectorPath == null ? Input.empty() : this.labelSelectorPath;
    }

    @InputImport(name="specReplicasPath", required=true)
    private final Input<String> specReplicasPath;

    public Input<String> getSpecReplicasPath() {
        return this.specReplicasPath;
    }

    @InputImport(name="statusReplicasPath", required=true)
    private final Input<String> statusReplicasPath;

    public Input<String> getStatusReplicasPath() {
        return this.statusReplicasPath;
    }

    public CustomResourceSubresourceScaleArgs(
        @Nullable Input<String> labelSelectorPath,
        Input<String> specReplicasPath,
        Input<String> statusReplicasPath) {
        this.labelSelectorPath = labelSelectorPath;
        this.specReplicasPath = Objects.requireNonNull(specReplicasPath, "expected parameter 'specReplicasPath' to be non-null");
        this.statusReplicasPath = Objects.requireNonNull(statusReplicasPath, "expected parameter 'statusReplicasPath' to be non-null");
    }

    private CustomResourceSubresourceScaleArgs() {
        this.labelSelectorPath = Input.empty();
        this.specReplicasPath = Input.empty();
        this.statusReplicasPath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceSubresourceScaleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> labelSelectorPath;
        private Input<String> specReplicasPath;
        private Input<String> statusReplicasPath;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomResourceSubresourceScaleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labelSelectorPath = defaults.labelSelectorPath;
    	      this.specReplicasPath = defaults.specReplicasPath;
    	      this.statusReplicasPath = defaults.statusReplicasPath;
        }

        public Builder setLabelSelectorPath(@Nullable Input<String> labelSelectorPath) {
            this.labelSelectorPath = labelSelectorPath;
            return this;
        }

        public Builder setLabelSelectorPath(@Nullable String labelSelectorPath) {
            this.labelSelectorPath = Input.ofNullable(labelSelectorPath);
            return this;
        }

        public Builder setSpecReplicasPath(Input<String> specReplicasPath) {
            this.specReplicasPath = Objects.requireNonNull(specReplicasPath);
            return this;
        }

        public Builder setSpecReplicasPath(String specReplicasPath) {
            this.specReplicasPath = Input.of(Objects.requireNonNull(specReplicasPath));
            return this;
        }

        public Builder setStatusReplicasPath(Input<String> statusReplicasPath) {
            this.statusReplicasPath = Objects.requireNonNull(statusReplicasPath);
            return this;
        }

        public Builder setStatusReplicasPath(String statusReplicasPath) {
            this.statusReplicasPath = Input.of(Objects.requireNonNull(statusReplicasPath));
            return this;
        }

        public CustomResourceSubresourceScaleArgs build() {
            return new CustomResourceSubresourceScaleArgs(labelSelectorPath, specReplicasPath, statusReplicasPath);
        }
    }
}
