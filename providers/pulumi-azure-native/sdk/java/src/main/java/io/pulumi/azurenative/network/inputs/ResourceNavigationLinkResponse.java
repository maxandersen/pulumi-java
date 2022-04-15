// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ResourceNavigationLink resource.
 * 
 */
public final class ResourceNavigationLinkResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourceNavigationLinkResponse Empty = new ResourceNavigationLinkResponse();

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Import(name="etag", required=true)
      private final String etag;

    public String etag() {
        return this.etag;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String id() {
        return this.id;
    }

    /**
     * Link to the external resource.
     * 
     */
    @Import(name="link")
      private final @Nullable String link;

    public Optional<String> link() {
        return this.link == null ? Optional.empty() : Optional.ofNullable(this.link);
    }

    /**
     * Resource type of the linked resource.
     * 
     */
    @Import(name="linkedResourceType")
      private final @Nullable String linkedResourceType;

    public Optional<String> linkedResourceType() {
        return this.linkedResourceType == null ? Optional.empty() : Optional.ofNullable(this.linkedResourceType);
    }

    /**
     * Name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The provisioning state of the resource navigation link resource.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Resource type.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public ResourceNavigationLinkResponse(
        String etag,
        String id,
        @Nullable String link,
        @Nullable String linkedResourceType,
        @Nullable String name,
        String provisioningState,
        String type) {
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.link = link;
        this.linkedResourceType = linkedResourceType;
        this.name = name;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ResourceNavigationLinkResponse() {
        this.etag = null;
        this.id = null;
        this.link = null;
        this.linkedResourceType = null;
        this.name = null;
        this.provisioningState = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceNavigationLinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private String id;
        private @Nullable String link;
        private @Nullable String linkedResourceType;
        private @Nullable String name;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceNavigationLinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.link = defaults.link;
    	      this.linkedResourceType = defaults.linkedResourceType;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder link(@Nullable String link) {
            this.link = link;
            return this;
        }
        public Builder linkedResourceType(@Nullable String linkedResourceType) {
            this.linkedResourceType = linkedResourceType;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ResourceNavigationLinkResponse build() {
            return new ResourceNavigationLinkResponse(etag, id, link, linkedResourceType, name, provisioningState, type);
        }
    }
}
