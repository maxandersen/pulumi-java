// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.resiliencehub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppPhysicalResourceId {
    private final @Nullable String awsAccountId;
    private final @Nullable String awsRegion;
    private final String identifier;
    private final String type;

    @CustomType.Constructor
    private AppPhysicalResourceId(
        @CustomType.Parameter("awsAccountId") @Nullable String awsAccountId,
        @CustomType.Parameter("awsRegion") @Nullable String awsRegion,
        @CustomType.Parameter("identifier") String identifier,
        @CustomType.Parameter("type") String type) {
        this.awsAccountId = awsAccountId;
        this.awsRegion = awsRegion;
        this.identifier = identifier;
        this.type = type;
    }

    public Optional<String> awsAccountId() {
        return Optional.ofNullable(this.awsAccountId);
    }
    public Optional<String> awsRegion() {
        return Optional.ofNullable(this.awsRegion);
    }
    public String identifier() {
        return this.identifier;
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppPhysicalResourceId defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String awsAccountId;
        private @Nullable String awsRegion;
        private String identifier;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AppPhysicalResourceId defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsAccountId = defaults.awsAccountId;
    	      this.awsRegion = defaults.awsRegion;
    	      this.identifier = defaults.identifier;
    	      this.type = defaults.type;
        }

        public Builder awsAccountId(@Nullable String awsAccountId) {
            this.awsAccountId = awsAccountId;
            return this;
        }
        public Builder awsRegion(@Nullable String awsRegion) {
            this.awsRegion = awsRegion;
            return this;
        }
        public Builder identifier(String identifier) {
            this.identifier = Objects.requireNonNull(identifier);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public AppPhysicalResourceId build() {
            return new AppPhysicalResourceId(awsAccountId, awsRegion, identifier, type);
        }
    }
}
