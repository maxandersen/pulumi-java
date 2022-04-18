// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory;

import com.pulumi.azurenative.datafactory.inputs.BlobEventsTriggerArgs;
import com.pulumi.azurenative.datafactory.inputs.BlobTriggerArgs;
import com.pulumi.azurenative.datafactory.inputs.ChainingTriggerArgs;
import com.pulumi.azurenative.datafactory.inputs.CustomEventsTriggerArgs;
import com.pulumi.azurenative.datafactory.inputs.MultiplePipelineTriggerArgs;
import com.pulumi.azurenative.datafactory.inputs.RerunTumblingWindowTriggerArgs;
import com.pulumi.azurenative.datafactory.inputs.ScheduleTriggerArgs;
import com.pulumi.azurenative.datafactory.inputs.TumblingWindowTriggerArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerArgs extends com.pulumi.resources.ResourceArgs {

    public static final TriggerArgs Empty = new TriggerArgs();

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
     * Properties of the trigger.
     * 
     */
    @Import(name="properties", required=true)
      private final Output<Object> properties;

    public Output<Object> properties() {
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

    /**
     * The trigger name.
     * 
     */
    @Import(name="triggerName")
      private final @Nullable Output<String> triggerName;

    public Output<String> triggerName() {
        return this.triggerName == null ? Codegen.empty() : this.triggerName;
    }

    public TriggerArgs(
        Output<String> factoryName,
        Output<Object> properties,
        Output<String> resourceGroupName,
        @Nullable Output<String> triggerName) {
        this.factoryName = Objects.requireNonNull(factoryName, "expected parameter 'factoryName' to be non-null");
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.triggerName = triggerName;
    }

    private TriggerArgs() {
        this.factoryName = Codegen.empty();
        this.properties = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.triggerName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> factoryName;
        private Output<Object> properties;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> triggerName;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.factoryName = defaults.factoryName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.triggerName = defaults.triggerName;
        }

        public Builder factoryName(Output<String> factoryName) {
            this.factoryName = Objects.requireNonNull(factoryName);
            return this;
        }
        public Builder factoryName(String factoryName) {
            this.factoryName = Output.of(Objects.requireNonNull(factoryName));
            return this;
        }
        public Builder properties(Output<Object> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder properties(Object properties) {
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
        }
        public Builder triggerName(@Nullable Output<String> triggerName) {
            this.triggerName = triggerName;
            return this;
        }
        public Builder triggerName(@Nullable String triggerName) {
            this.triggerName = Codegen.ofNullable(triggerName);
            return this;
        }        public TriggerArgs build() {
            return new TriggerArgs(factoryName, properties, resourceGroupName, triggerName);
        }
    }
}
