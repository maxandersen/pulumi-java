// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.testing_v1.inputs.AndroidDeviceListArgs;
import io.pulumi.googlenative.testing_v1.inputs.AndroidMatrixArgs;
import io.pulumi.googlenative.testing_v1.inputs.IosDeviceListArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The matrix of environments in which the test is to be executed.
 * 
 */
public final class EnvironmentMatrixArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentMatrixArgs Empty = new EnvironmentMatrixArgs();

    /**
     * A list of Android devices; the test will be run only on the specified devices.
     * 
     */
    @Import(name="androidDeviceList")
      private final @Nullable Output<AndroidDeviceListArgs> androidDeviceList;

    public Output<AndroidDeviceListArgs> androidDeviceList() {
        return this.androidDeviceList == null ? Codegen.empty() : this.androidDeviceList;
    }

    /**
     * A matrix of Android devices.
     * 
     */
    @Import(name="androidMatrix")
      private final @Nullable Output<AndroidMatrixArgs> androidMatrix;

    public Output<AndroidMatrixArgs> androidMatrix() {
        return this.androidMatrix == null ? Codegen.empty() : this.androidMatrix;
    }

    /**
     * A list of iOS devices.
     * 
     */
    @Import(name="iosDeviceList")
      private final @Nullable Output<IosDeviceListArgs> iosDeviceList;

    public Output<IosDeviceListArgs> iosDeviceList() {
        return this.iosDeviceList == null ? Codegen.empty() : this.iosDeviceList;
    }

    public EnvironmentMatrixArgs(
        @Nullable Output<AndroidDeviceListArgs> androidDeviceList,
        @Nullable Output<AndroidMatrixArgs> androidMatrix,
        @Nullable Output<IosDeviceListArgs> iosDeviceList) {
        this.androidDeviceList = androidDeviceList;
        this.androidMatrix = androidMatrix;
        this.iosDeviceList = iosDeviceList;
    }

    private EnvironmentMatrixArgs() {
        this.androidDeviceList = Codegen.empty();
        this.androidMatrix = Codegen.empty();
        this.iosDeviceList = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentMatrixArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AndroidDeviceListArgs> androidDeviceList;
        private @Nullable Output<AndroidMatrixArgs> androidMatrix;
        private @Nullable Output<IosDeviceListArgs> iosDeviceList;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentMatrixArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.androidDeviceList = defaults.androidDeviceList;
    	      this.androidMatrix = defaults.androidMatrix;
    	      this.iosDeviceList = defaults.iosDeviceList;
        }

        public Builder androidDeviceList(@Nullable Output<AndroidDeviceListArgs> androidDeviceList) {
            this.androidDeviceList = androidDeviceList;
            return this;
        }
        public Builder androidDeviceList(@Nullable AndroidDeviceListArgs androidDeviceList) {
            this.androidDeviceList = Codegen.ofNullable(androidDeviceList);
            return this;
        }
        public Builder androidMatrix(@Nullable Output<AndroidMatrixArgs> androidMatrix) {
            this.androidMatrix = androidMatrix;
            return this;
        }
        public Builder androidMatrix(@Nullable AndroidMatrixArgs androidMatrix) {
            this.androidMatrix = Codegen.ofNullable(androidMatrix);
            return this;
        }
        public Builder iosDeviceList(@Nullable Output<IosDeviceListArgs> iosDeviceList) {
            this.iosDeviceList = iosDeviceList;
            return this;
        }
        public Builder iosDeviceList(@Nullable IosDeviceListArgs iosDeviceList) {
            this.iosDeviceList = Codegen.ofNullable(iosDeviceList);
            return this;
        }        public EnvironmentMatrixArgs build() {
            return new EnvironmentMatrixArgs(androidDeviceList, androidMatrix, iosDeviceList);
        }
    }
}
