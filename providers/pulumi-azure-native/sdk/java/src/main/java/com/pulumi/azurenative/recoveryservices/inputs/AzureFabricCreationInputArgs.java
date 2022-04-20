// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Fabric provider specific settings.
 * 
 */
public final class AzureFabricCreationInputArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureFabricCreationInputArgs Empty = new AzureFabricCreationInputArgs();

    /**
     * Gets the class type.
     * Expected value is &#39;Azure&#39;.
     * 
     */
    @Import(name="instanceType")
      private final @Nullable Output<String> instanceType;

    public Output<String> instanceType() {
        return this.instanceType == null ? Codegen.empty() : this.instanceType;
    }

    /**
     * The Location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    public AzureFabricCreationInputArgs(
        @Nullable Output<String> instanceType,
        @Nullable Output<String> location) {
        this.instanceType = Codegen.stringProp("instanceType").output().arg(instanceType).getNullable();
        this.location = location;
    }

    private AzureFabricCreationInputArgs() {
        this.instanceType = Codegen.empty();
        this.location = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFabricCreationInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> instanceType;
        private @Nullable Output<String> location;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFabricCreationInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
    	      this.location = defaults.location;
        }

        public Builder instanceType(@Nullable Output<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = Codegen.ofNullable(instanceType);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }        public AzureFabricCreationInputArgs build() {
            return new AzureFabricCreationInputArgs(instanceType, location);
        }
    }
}
