// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory;

import com.pulumi.azurenative.datafactory.inputs.ManagedIntegrationRuntimeArgs;
import com.pulumi.azurenative.datafactory.inputs.SelfHostedIntegrationRuntimeArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntegrationRuntimeArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationRuntimeArgs Empty = new IntegrationRuntimeArgs();

    /**
     * The factory name.
     * 
     */
    @Import(name="factoryName", required=true)
      private final Output<String> factoryName;

    public Output<String> factoryName() {
        return this.factoryName;
    }

    /**
     * The integration runtime name.
     * 
     */
    @Import(name="integrationRuntimeName")
      private final @Nullable Output<String> integrationRuntimeName;

    public Output<String> integrationRuntimeName() {
        return this.integrationRuntimeName == null ? Codegen.empty() : this.integrationRuntimeName;
    }

    /**
     * Integration runtime properties.
     * 
     */
    @Import(name="properties", required=true)
      private final Output<Either<ManagedIntegrationRuntimeArgs,SelfHostedIntegrationRuntimeArgs>> properties;

    public Output<Either<ManagedIntegrationRuntimeArgs,SelfHostedIntegrationRuntimeArgs>> properties() {
        return this.properties;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    public IntegrationRuntimeArgs(
        Output<String> factoryName,
        @Nullable Output<String> integrationRuntimeName,
        Output<Either<ManagedIntegrationRuntimeArgs,SelfHostedIntegrationRuntimeArgs>> properties,
        Output<String> resourceGroupName) {
        this.factoryName = Objects.requireNonNull(factoryName, "expected parameter 'factoryName' to be non-null");
        this.integrationRuntimeName = integrationRuntimeName;
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private IntegrationRuntimeArgs() {
        this.factoryName = Codegen.empty();
        this.integrationRuntimeName = Codegen.empty();
        this.properties = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationRuntimeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> factoryName;
        private @Nullable Output<String> integrationRuntimeName;
        private Output<Either<ManagedIntegrationRuntimeArgs,SelfHostedIntegrationRuntimeArgs>> properties;
        private Output<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationRuntimeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.factoryName = defaults.factoryName;
    	      this.integrationRuntimeName = defaults.integrationRuntimeName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder factoryName(Output<String> factoryName) {
            this.factoryName = Objects.requireNonNull(factoryName);
            return this;
        }
        public Builder factoryName(String factoryName) {
            this.factoryName = Output.of(Objects.requireNonNull(factoryName));
            return this;
        }
        public Builder integrationRuntimeName(@Nullable Output<String> integrationRuntimeName) {
            this.integrationRuntimeName = integrationRuntimeName;
            return this;
        }
        public Builder integrationRuntimeName(@Nullable String integrationRuntimeName) {
            this.integrationRuntimeName = Codegen.ofNullable(integrationRuntimeName);
            return this;
        }
        public Builder properties(Output<Either<ManagedIntegrationRuntimeArgs,SelfHostedIntegrationRuntimeArgs>> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder properties(Either<ManagedIntegrationRuntimeArgs,SelfHostedIntegrationRuntimeArgs> properties) {
            this.properties = Output.of(Objects.requireNonNull(properties));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }        public IntegrationRuntimeArgs build() {
            return new IntegrationRuntimeArgs(factoryName, integrationRuntimeName, properties, resourceGroupName);
        }
    }
}
