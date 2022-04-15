// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.web.inputs.ConnStringValueTypePairArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAppConnectionStringsSlotArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAppConnectionStringsSlotArgs Empty = new WebAppConnectionStringsSlotArgs();

    /**
     * Kind of resource.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> kind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * Name of the app.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Connection strings.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<Map<String,ConnStringValueTypePairArgs>> properties;

    public Output<Map<String,ConnStringValueTypePairArgs>> properties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the deployment slot. If a slot is not specified, the API will update the connection settings for the production slot.
     * 
     */
    @Import(name="slot", required=true)
      private final Output<String> slot;

    public Output<String> slot() {
        return this.slot;
    }

    public WebAppConnectionStringsSlotArgs(
        @Nullable Output<String> kind,
        Output<String> name,
        @Nullable Output<Map<String,ConnStringValueTypePairArgs>> properties,
        Output<String> resourceGroupName,
        Output<String> slot) {
        this.kind = kind;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.slot = Objects.requireNonNull(slot, "expected parameter 'slot' to be non-null");
    }

    private WebAppConnectionStringsSlotArgs() {
        this.kind = Codegen.empty();
        this.name = Codegen.empty();
        this.properties = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.slot = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAppConnectionStringsSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> kind;
        private Output<String> name;
        private @Nullable Output<Map<String,ConnStringValueTypePairArgs>> properties;
        private Output<String> resourceGroupName;
        private Output<String> slot;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAppConnectionStringsSlotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.slot = defaults.slot;
        }

        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder properties(@Nullable Output<Map<String,ConnStringValueTypePairArgs>> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable Map<String,ConnStringValueTypePairArgs> properties) {
            this.properties = Codegen.ofNullable(properties);
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
        public Builder slot(Output<String> slot) {
            this.slot = Objects.requireNonNull(slot);
            return this;
        }
        public Builder slot(String slot) {
            this.slot = Output.of(Objects.requireNonNull(slot));
            return this;
        }        public WebAppConnectionStringsSlotArgs build() {
            return new WebAppConnectionStringsSlotArgs(kind, name, properties, resourceGroupName, slot);
        }
    }
}
