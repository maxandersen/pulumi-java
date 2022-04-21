// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicediscovery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateDnsNamespaceState extends com.pulumi.resources.ResourceArgs {

    public static final PrivateDnsNamespaceState Empty = new PrivateDnsNamespaceState();

    /**
     * The ARN that Amazon Route 53 assigns to the namespace when you create it.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The description that you specify for the namespace when you create it.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The ID for the hosted zone that Amazon Route 53 creates when you create a namespace.
     * 
     */
    @Import(name="hostedZone")
    private @Nullable Output<String> hostedZone;

    public Optional<Output<String>> hostedZone() {
        return Optional.ofNullable(this.hostedZone);
    }

    /**
     * The name of the namespace.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A map of tags to assign to the namespace. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * The ID of VPC that you want to associate the namespace with.
     * 
     */
    @Import(name="vpc")
    private @Nullable Output<String> vpc;

    public Optional<Output<String>> vpc() {
        return Optional.ofNullable(this.vpc);
    }

    private PrivateDnsNamespaceState() {}

    private PrivateDnsNamespaceState(PrivateDnsNamespaceState $) {
        this.arn = $.arn;
        this.description = $.description;
        this.hostedZone = $.hostedZone;
        this.name = $.name;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.vpc = $.vpc;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateDnsNamespaceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateDnsNamespaceState $;

        public Builder() {
            $ = new PrivateDnsNamespaceState();
        }

        public Builder(PrivateDnsNamespaceState defaults) {
            $ = new PrivateDnsNamespaceState(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder hostedZone(@Nullable Output<String> hostedZone) {
            $.hostedZone = hostedZone;
            return this;
        }

        public Builder hostedZone(String hostedZone) {
            return hostedZone(Output.of(hostedZone));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
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

        public Builder vpc(@Nullable Output<String> vpc) {
            $.vpc = vpc;
            return this;
        }

        public Builder vpc(String vpc) {
            return vpc(Output.of(vpc));
        }

        public PrivateDnsNamespaceState build() {
            return $;
        }
    }

}
