// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWebAppDomainOwnershipIdentifierResult {
    /**
     * @return Resource Id.
     * 
     */
    private final String id;
    /**
     * @return Kind of resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * @return Resource Name.
     * 
     */
    private final String name;
    /**
     * @return Resource type.
     * 
     */
    private final String type;
    /**
     * @return String representation of the identity.
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private GetWebAppDomainOwnershipIdentifierResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("value") @Nullable String value) {
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.type = type;
        this.value = value;
    }

    /**
     * @return Resource Id.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Kind of resource.
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return Resource Name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return String representation of the identity.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppDomainOwnershipIdentifierResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String kind;
        private String name;
        private String type;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppDomainOwnershipIdentifierResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public GetWebAppDomainOwnershipIdentifierResult build() {
            return new GetWebAppDomainOwnershipIdentifierResult(id, kind, name, type, value);
        }
    }
}
