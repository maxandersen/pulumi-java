// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.m365securityandcompliance;

import com.pulumi.azurenative.m365securityandcompliance.enums.Kind;
import com.pulumi.azurenative.m365securityandcompliance.inputs.ServicesPropertiesArgs;
import com.pulumi.azurenative.m365securityandcompliance.inputs.ServicesResourceIdentityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivateLinkServicesForEDMUploadArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateLinkServicesForEDMUploadArgs Empty = new PrivateLinkServicesForEDMUploadArgs();

    /**
     * Setting indicating whether the service has a managed identity associated with it.
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<ServicesResourceIdentityArgs> identity;

    public Output<ServicesResourceIdentityArgs> identity() {
        return this.identity == null ? Codegen.empty() : this.identity;
    }

    /**
     * The kind of the service.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<Kind> kind;

    public Output<Kind> kind() {
        return this.kind;
    }

    /**
     * The resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The common properties of a service.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<ServicesPropertiesArgs> properties;

    public Output<ServicesPropertiesArgs> properties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    /**
     * The name of the resource group that contains the service instance.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the service instance.
     * 
     */
    @Import(name="resourceName")
      private final @Nullable Output<String> resourceName;

    public Output<String> resourceName() {
        return this.resourceName == null ? Codegen.empty() : this.resourceName;
    }

    /**
     * The resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public PrivateLinkServicesForEDMUploadArgs(
        @Nullable Output<ServicesResourceIdentityArgs> identity,
        Output<Kind> kind,
        @Nullable Output<String> location,
        @Nullable Output<ServicesPropertiesArgs> properties,
        Output<String> resourceGroupName,
        @Nullable Output<String> resourceName,
        @Nullable Output<Map<String,String>> tags) {
        this.identity = identity;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.location = location;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = resourceName;
        this.tags = tags;
    }

    private PrivateLinkServicesForEDMUploadArgs() {
        this.identity = Codegen.empty();
        this.kind = Codegen.empty();
        this.location = Codegen.empty();
        this.properties = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.resourceName = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServicesForEDMUploadArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ServicesResourceIdentityArgs> identity;
        private Output<Kind> kind;
        private @Nullable Output<String> location;
        private @Nullable Output<ServicesPropertiesArgs> properties;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> resourceName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServicesForEDMUploadArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identity = defaults.identity;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.tags = defaults.tags;
        }

        public Builder identity(@Nullable Output<ServicesResourceIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }
        public Builder identity(@Nullable ServicesResourceIdentityArgs identity) {
            this.identity = Codegen.ofNullable(identity);
            return this;
        }
        public Builder kind(Output<Kind> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(Kind kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder properties(@Nullable Output<ServicesPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable ServicesPropertiesArgs properties) {
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
        public Builder resourceName(@Nullable Output<String> resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public Builder resourceName(@Nullable String resourceName) {
            this.resourceName = Codegen.ofNullable(resourceName);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public PrivateLinkServicesForEDMUploadArgs build() {
            return new PrivateLinkServicesForEDMUploadArgs(identity, kind, location, properties, resourceGroupName, resourceName, tags);
        }
    }
}
