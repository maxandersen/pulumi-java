// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudcontrol.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetResourceResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String identifier;
    /**
     * JSON string matching the CloudFormation resource type schema with current configuration.
     * 
     */
    private final String properties;
    private final @Nullable String roleArn;
    private final String typeName;
    private final @Nullable String typeVersionId;

    @CustomType.Constructor
    private GetResourceResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identifier") String identifier,
        @CustomType.Parameter("properties") String properties,
        @CustomType.Parameter("roleArn") @Nullable String roleArn,
        @CustomType.Parameter("typeName") String typeName,
        @CustomType.Parameter("typeVersionId") @Nullable String typeVersionId) {
        this.id = id;
        this.identifier = identifier;
        this.properties = properties;
        this.roleArn = roleArn;
        this.typeName = typeName;
        this.typeVersionId = typeVersionId;
    }

    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    public String identifier() {
        return this.identifier;
    }
    /**
     * JSON string matching the CloudFormation resource type schema with current configuration.
     * 
    */
    public String properties() {
        return this.properties;
    }
    public Optional<String> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }
    public String typeName() {
        return this.typeName;
    }
    public Optional<String> typeVersionId() {
        return Optional.ofNullable(this.typeVersionId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String identifier;
        private String properties;
        private @Nullable String roleArn;
        private String typeName;
        private @Nullable String typeVersionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.identifier = defaults.identifier;
    	      this.properties = defaults.properties;
    	      this.roleArn = defaults.roleArn;
    	      this.typeName = defaults.typeName;
    	      this.typeVersionId = defaults.typeVersionId;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identifier(String identifier) {
            this.identifier = Objects.requireNonNull(identifier);
            return this;
        }
        public Builder properties(String properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public Builder typeName(String typeName) {
            this.typeName = Objects.requireNonNull(typeName);
            return this;
        }
        public Builder typeVersionId(@Nullable String typeVersionId) {
            this.typeVersionId = typeVersionId;
            return this;
        }        public GetResourceResult build() {
            return new GetResourceResult(id, identifier, properties, roleArn, typeName, typeVersionId);
        }
    }
}
