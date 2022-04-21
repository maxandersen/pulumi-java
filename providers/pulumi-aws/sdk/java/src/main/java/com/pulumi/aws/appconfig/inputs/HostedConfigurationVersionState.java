// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HostedConfigurationVersionState extends com.pulumi.resources.ResourceArgs {

    public static final HostedConfigurationVersionState Empty = new HostedConfigurationVersionState();

    /**
     * The application ID.
     * 
     */
    @Import(name="applicationId")
    private @Nullable Output<String> applicationId;

    public Optional<Output<String>> applicationId() {
        return Optional.ofNullable(this.applicationId);
    }

    /**
     * The Amazon Resource Name (ARN) of the AppConfig  hosted configuration version.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The configuration profile ID.
     * 
     */
    @Import(name="configurationProfileId")
    private @Nullable Output<String> configurationProfileId;

    public Optional<Output<String>> configurationProfileId() {
        return Optional.ofNullable(this.configurationProfileId);
    }

    /**
     * The content of the configuration or the configuration data.
     * 
     */
    @Import(name="content")
    private @Nullable Output<String> content;

    public Optional<Output<String>> content() {
        return Optional.ofNullable(this.content);
    }

    /**
     * A standard MIME type describing the format of the configuration content. For more information, see [Content-Type](https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17).
     * 
     */
    @Import(name="contentType")
    private @Nullable Output<String> contentType;

    public Optional<Output<String>> contentType() {
        return Optional.ofNullable(this.contentType);
    }

    /**
     * A description of the configuration.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The version number of the hosted configuration.
     * 
     */
    @Import(name="versionNumber")
    private @Nullable Output<Integer> versionNumber;

    public Optional<Output<Integer>> versionNumber() {
        return Optional.ofNullable(this.versionNumber);
    }

    private HostedConfigurationVersionState() {}

    private HostedConfigurationVersionState(HostedConfigurationVersionState $) {
        this.applicationId = $.applicationId;
        this.arn = $.arn;
        this.configurationProfileId = $.configurationProfileId;
        this.content = $.content;
        this.contentType = $.contentType;
        this.description = $.description;
        this.versionNumber = $.versionNumber;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostedConfigurationVersionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostedConfigurationVersionState $;

        public Builder() {
            $ = new HostedConfigurationVersionState();
        }

        public Builder(HostedConfigurationVersionState defaults) {
            $ = new HostedConfigurationVersionState(Objects.requireNonNull(defaults));
        }

        public Builder applicationId(@Nullable Output<String> applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        public Builder applicationId(String applicationId) {
            return applicationId(Output.of(applicationId));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder configurationProfileId(@Nullable Output<String> configurationProfileId) {
            $.configurationProfileId = configurationProfileId;
            return this;
        }

        public Builder configurationProfileId(String configurationProfileId) {
            return configurationProfileId(Output.of(configurationProfileId));
        }

        public Builder content(@Nullable Output<String> content) {
            $.content = content;
            return this;
        }

        public Builder content(String content) {
            return content(Output.of(content));
        }

        public Builder contentType(@Nullable Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        public Builder contentType(String contentType) {
            return contentType(Output.of(contentType));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder versionNumber(@Nullable Output<Integer> versionNumber) {
            $.versionNumber = versionNumber;
            return this;
        }

        public Builder versionNumber(Integer versionNumber) {
            return versionNumber(Output.of(versionNumber));
        }

        public HostedConfigurationVersionState build() {
            return $;
        }
    }

}
