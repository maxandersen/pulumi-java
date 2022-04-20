// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.remotebuildexecution_v1alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * AcceleratorConfig defines the accelerator cards to attach to the VM.
 * 
 */
public final class GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs Empty = new GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs();

    /**
     * The number of guest accelerator cards exposed to each VM.
     * 
     */
    @Import(name="acceleratorCount")
      private final @Nullable Output<String> acceleratorCount;

    public Output<String> acceleratorCount() {
        return this.acceleratorCount == null ? Codegen.empty() : this.acceleratorCount;
    }

    /**
     * The type of accelerator to attach to each VM, e.g. &#34;nvidia-tesla-k80&#34; for nVidia Tesla K80.
     * 
     */
    @Import(name="acceleratorType")
      private final @Nullable Output<String> acceleratorType;

    public Output<String> acceleratorType() {
        return this.acceleratorType == null ? Codegen.empty() : this.acceleratorType;
    }

    public GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs(
        @Nullable Output<String> acceleratorCount,
        @Nullable Output<String> acceleratorType) {
        this.acceleratorCount = acceleratorCount;
        this.acceleratorType = acceleratorType;
    }

    private GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs() {
        this.acceleratorCount = Codegen.empty();
        this.acceleratorType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> acceleratorCount;
        private @Nullable Output<String> acceleratorType;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorCount = defaults.acceleratorCount;
    	      this.acceleratorType = defaults.acceleratorType;
        }

        public Builder acceleratorCount(@Nullable Output<String> acceleratorCount) {
            this.acceleratorCount = acceleratorCount;
            return this;
        }
        public Builder acceleratorCount(@Nullable String acceleratorCount) {
            this.acceleratorCount = Codegen.ofNullable(acceleratorCount);
            return this;
        }
        public Builder acceleratorType(@Nullable Output<String> acceleratorType) {
            this.acceleratorType = acceleratorType;
            return this;
        }
        public Builder acceleratorType(@Nullable String acceleratorType) {
            this.acceleratorType = Codegen.ofNullable(acceleratorType);
            return this;
        }        public GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs build() {
            return new GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs(acceleratorCount, acceleratorType);
        }
    }
}
