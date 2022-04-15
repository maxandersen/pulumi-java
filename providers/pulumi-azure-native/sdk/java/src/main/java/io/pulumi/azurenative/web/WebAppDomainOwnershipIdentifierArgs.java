// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAppDomainOwnershipIdentifierArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAppDomainOwnershipIdentifierArgs Empty = new WebAppDomainOwnershipIdentifierArgs();

    /**
     * Name of domain ownership identifier.
     * 
     */
    @Import(name="domainOwnershipIdentifierName")
      private final @Nullable Output<String> domainOwnershipIdentifierName;

    public Output<String> domainOwnershipIdentifierName() {
        return this.domainOwnershipIdentifierName == null ? Codegen.empty() : this.domainOwnershipIdentifierName;
    }

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
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * String representation of the identity.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> value() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public WebAppDomainOwnershipIdentifierArgs(
        @Nullable Output<String> domainOwnershipIdentifierName,
        @Nullable Output<String> kind,
        Output<String> name,
        Output<String> resourceGroupName,
        @Nullable Output<String> value) {
        this.domainOwnershipIdentifierName = domainOwnershipIdentifierName;
        this.kind = kind;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.value = value;
    }

    private WebAppDomainOwnershipIdentifierArgs() {
        this.domainOwnershipIdentifierName = Codegen.empty();
        this.kind = Codegen.empty();
        this.name = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAppDomainOwnershipIdentifierArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> domainOwnershipIdentifierName;
        private @Nullable Output<String> kind;
        private Output<String> name;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAppDomainOwnershipIdentifierArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainOwnershipIdentifierName = defaults.domainOwnershipIdentifierName;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.value = defaults.value;
        }

        public Builder domainOwnershipIdentifierName(@Nullable Output<String> domainOwnershipIdentifierName) {
            this.domainOwnershipIdentifierName = domainOwnershipIdentifierName;
            return this;
        }
        public Builder domainOwnershipIdentifierName(@Nullable String domainOwnershipIdentifierName) {
            this.domainOwnershipIdentifierName = Codegen.ofNullable(domainOwnershipIdentifierName);
            return this;
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
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public WebAppDomainOwnershipIdentifierArgs build() {
            return new WebAppDomainOwnershipIdentifierArgs(domainOwnershipIdentifierName, kind, name, resourceGroupName, value);
        }
    }
}
