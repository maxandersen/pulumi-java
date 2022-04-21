// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ComponentArgs extends com.pulumi.resources.ResourceArgs {

    public static final ComponentArgs Empty = new ComponentArgs();

    /**
     * Change description of the component.
     * 
     */
    @Import(name="changeDescription")
    private @Nullable Output<String> changeDescription;

    public Optional<Output<String>> changeDescription() {
        return Optional.ofNullable(this.changeDescription);
    }

    /**
     * Inline YAML string with data of the component. Exactly one of `data` and `uri` can be specified. the provider will only perform drift detection of its value when present in a configuration.
     * 
     */
    @Import(name="data")
    private @Nullable Output<String> data;

    public Optional<Output<String>> data() {
        return Optional.ofNullable(this.data);
    }

    /**
     * Description of the component.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Amazon Resource Name (ARN) of the Key Management Service (KMS) Key used to encrypt the component.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * Name of the component.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Platform of the component.
     * 
     */
    @Import(name="platform", required=true)
    private Output<String> platform;

    public Output<String> platform() {
        return this.platform;
    }

    /**
     * Set of Operating Systems (OS) supported by the component.
     * 
     */
    @Import(name="supportedOsVersions")
    private @Nullable Output<List<String>> supportedOsVersions;

    public Optional<Output<List<String>>> supportedOsVersions() {
        return Optional.ofNullable(this.supportedOsVersions);
    }

    /**
     * Key-value map of resource tags for the component. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * S3 URI with data of the component. Exactly one of `data` and `uri` can be specified.
     * 
     */
    @Import(name="uri")
    private @Nullable Output<String> uri;

    public Optional<Output<String>> uri() {
        return Optional.ofNullable(this.uri);
    }

    /**
     * Version of the component.
     * 
     */
    @Import(name="version", required=true)
    private Output<String> version;

    public Output<String> version() {
        return this.version;
    }

    private ComponentArgs() {}

    private ComponentArgs(ComponentArgs $) {
        this.changeDescription = $.changeDescription;
        this.data = $.data;
        this.description = $.description;
        this.kmsKeyId = $.kmsKeyId;
        this.name = $.name;
        this.platform = $.platform;
        this.supportedOsVersions = $.supportedOsVersions;
        this.tags = $.tags;
        this.uri = $.uri;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ComponentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ComponentArgs $;

        public Builder() {
            $ = new ComponentArgs();
        }

        public Builder(ComponentArgs defaults) {
            $ = new ComponentArgs(Objects.requireNonNull(defaults));
        }

        public Builder changeDescription(@Nullable Output<String> changeDescription) {
            $.changeDescription = changeDescription;
            return this;
        }

        public Builder changeDescription(String changeDescription) {
            return changeDescription(Output.of(changeDescription));
        }

        public Builder data(@Nullable Output<String> data) {
            $.data = data;
            return this;
        }

        public Builder data(String data) {
            return data(Output.of(data));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder platform(Output<String> platform) {
            $.platform = platform;
            return this;
        }

        public Builder platform(String platform) {
            return platform(Output.of(platform));
        }

        public Builder supportedOsVersions(@Nullable Output<List<String>> supportedOsVersions) {
            $.supportedOsVersions = supportedOsVersions;
            return this;
        }

        public Builder supportedOsVersions(List<String> supportedOsVersions) {
            return supportedOsVersions(Output.of(supportedOsVersions));
        }

        public Builder supportedOsVersions(String... supportedOsVersions) {
            return supportedOsVersions(List.of(supportedOsVersions));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder uri(@Nullable Output<String> uri) {
            $.uri = uri;
            return this;
        }

        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        public Builder version(Output<String> version) {
            $.version = version;
            return this;
        }

        public Builder version(String version) {
            return version(Output.of(version));
        }

        public ComponentArgs build() {
            $.platform = Objects.requireNonNull($.platform, "expected parameter 'platform' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}
