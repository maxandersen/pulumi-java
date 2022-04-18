// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.refactorspaces.outputs;

import com.pulumi.awsnative.refactorspaces.outputs.ApplicationTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetApplicationResult {
    private final @Nullable String apiGatewayId;
    private final @Nullable String applicationIdentifier;
    private final @Nullable String arn;
    private final @Nullable String nlbArn;
    private final @Nullable String nlbName;
    private final @Nullable String proxyUrl;
    private final @Nullable String stageName;
    /**
     * Metadata that you can assign to help organize the frameworks that you create. Each tag is a key-value pair.
     * 
     */
    private final @Nullable List<ApplicationTag> tags;
    private final @Nullable String vpcLinkId;

    @CustomType.Constructor
    private GetApplicationResult(
        @CustomType.Parameter("apiGatewayId") @Nullable String apiGatewayId,
        @CustomType.Parameter("applicationIdentifier") @Nullable String applicationIdentifier,
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("nlbArn") @Nullable String nlbArn,
        @CustomType.Parameter("nlbName") @Nullable String nlbName,
        @CustomType.Parameter("proxyUrl") @Nullable String proxyUrl,
        @CustomType.Parameter("stageName") @Nullable String stageName,
        @CustomType.Parameter("tags") @Nullable List<ApplicationTag> tags,
        @CustomType.Parameter("vpcLinkId") @Nullable String vpcLinkId) {
        this.apiGatewayId = apiGatewayId;
        this.applicationIdentifier = applicationIdentifier;
        this.arn = arn;
        this.nlbArn = nlbArn;
        this.nlbName = nlbName;
        this.proxyUrl = proxyUrl;
        this.stageName = stageName;
        this.tags = tags;
        this.vpcLinkId = vpcLinkId;
    }

    public Optional<String> apiGatewayId() {
        return Optional.ofNullable(this.apiGatewayId);
    }
    public Optional<String> applicationIdentifier() {
        return Optional.ofNullable(this.applicationIdentifier);
    }
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<String> nlbArn() {
        return Optional.ofNullable(this.nlbArn);
    }
    public Optional<String> nlbName() {
        return Optional.ofNullable(this.nlbName);
    }
    public Optional<String> proxyUrl() {
        return Optional.ofNullable(this.proxyUrl);
    }
    public Optional<String> stageName() {
        return Optional.ofNullable(this.stageName);
    }
    /**
     * Metadata that you can assign to help organize the frameworks that you create. Each tag is a key-value pair.
     * 
    */
    public List<ApplicationTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    public Optional<String> vpcLinkId() {
        return Optional.ofNullable(this.vpcLinkId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiGatewayId;
        private @Nullable String applicationIdentifier;
        private @Nullable String arn;
        private @Nullable String nlbArn;
        private @Nullable String nlbName;
        private @Nullable String proxyUrl;
        private @Nullable String stageName;
        private @Nullable List<ApplicationTag> tags;
        private @Nullable String vpcLinkId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiGatewayId = defaults.apiGatewayId;
    	      this.applicationIdentifier = defaults.applicationIdentifier;
    	      this.arn = defaults.arn;
    	      this.nlbArn = defaults.nlbArn;
    	      this.nlbName = defaults.nlbName;
    	      this.proxyUrl = defaults.proxyUrl;
    	      this.stageName = defaults.stageName;
    	      this.tags = defaults.tags;
    	      this.vpcLinkId = defaults.vpcLinkId;
        }

        public Builder apiGatewayId(@Nullable String apiGatewayId) {
            this.apiGatewayId = apiGatewayId;
            return this;
        }
        public Builder applicationIdentifier(@Nullable String applicationIdentifier) {
            this.applicationIdentifier = applicationIdentifier;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder nlbArn(@Nullable String nlbArn) {
            this.nlbArn = nlbArn;
            return this;
        }
        public Builder nlbName(@Nullable String nlbName) {
            this.nlbName = nlbName;
            return this;
        }
        public Builder proxyUrl(@Nullable String proxyUrl) {
            this.proxyUrl = proxyUrl;
            return this;
        }
        public Builder stageName(@Nullable String stageName) {
            this.stageName = stageName;
            return this;
        }
        public Builder tags(@Nullable List<ApplicationTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(ApplicationTag... tags) {
            return tags(List.of(tags));
        }
        public Builder vpcLinkId(@Nullable String vpcLinkId) {
            this.vpcLinkId = vpcLinkId;
            return this;
        }        public GetApplicationResult build() {
            return new GetApplicationResult(apiGatewayId, applicationIdentifier, arn, nlbArn, nlbName, proxyUrl, stageName, tags, vpcLinkId);
        }
    }
}
