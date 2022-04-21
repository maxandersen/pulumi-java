// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.eks.inputs;

import com.pulumi.aws.eks.inputs.IdentityProviderConfigOidcGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IdentityProviderConfigState extends com.pulumi.resources.ResourceArgs {

    public static final IdentityProviderConfigState Empty = new IdentityProviderConfigState();

    /**
     * Amazon Resource Name (ARN) of the EKS Identity Provider Configuration.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Name of the EKS Cluster.
     * 
     */
    @Import(name="clusterName")
    private @Nullable Output<String> clusterName;

    public Optional<Output<String>> clusterName() {
        return Optional.ofNullable(this.clusterName);
    }

    /**
     * Nested attribute containing [OpenID Connect](https://openid.net/connect/) identity provider information for the cluster. Detailed below.
     * 
     */
    @Import(name="oidc")
    private @Nullable Output<IdentityProviderConfigOidcGetArgs> oidc;

    public Optional<Output<IdentityProviderConfigOidcGetArgs>> oidc() {
        return Optional.ofNullable(this.oidc);
    }

    /**
     * Status of the EKS Identity Provider Configuration.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private IdentityProviderConfigState() {}

    private IdentityProviderConfigState(IdentityProviderConfigState $) {
        this.arn = $.arn;
        this.clusterName = $.clusterName;
        this.oidc = $.oidc;
        this.status = $.status;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IdentityProviderConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IdentityProviderConfigState $;

        public Builder() {
            $ = new IdentityProviderConfigState();
        }

        public Builder(IdentityProviderConfigState defaults) {
            $ = new IdentityProviderConfigState(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder clusterName(@Nullable Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        public Builder oidc(@Nullable Output<IdentityProviderConfigOidcGetArgs> oidc) {
            $.oidc = oidc;
            return this;
        }

        public Builder oidc(IdentityProviderConfigOidcGetArgs oidc) {
            return oidc(Output.of(oidc));
        }

        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        public Builder status(String status) {
            return status(Output.of(status));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public IdentityProviderConfigState build() {
            return $;
        }
    }

}
