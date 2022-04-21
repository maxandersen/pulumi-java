// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2StoredInfoTypeConfigArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StoredInfoTypeArgs extends com.pulumi.resources.ResourceArgs {

    public static final StoredInfoTypeArgs Empty = new StoredInfoTypeArgs();

    /**
     * Configuration of the storedInfoType to create.
     * 
     */
    @Import(name="config", required=true)
    private Output<GooglePrivacyDlpV2StoredInfoTypeConfigArgs> config;

    public Output<GooglePrivacyDlpV2StoredInfoTypeConfigArgs> config() {
        return this.config;
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The storedInfoType ID can contain uppercase and lowercase letters, numbers, and hyphens; that is, it must match the regular expression: `[a-zA-Z\d-_]+`. The maximum length is 100 characters. Can be empty to allow the system to generate one.
     * 
     */
    @Import(name="storedInfoTypeId")
    private @Nullable Output<String> storedInfoTypeId;

    public Optional<Output<String>> storedInfoTypeId() {
        return Optional.ofNullable(this.storedInfoTypeId);
    }

    private StoredInfoTypeArgs() {}

    private StoredInfoTypeArgs(StoredInfoTypeArgs $) {
        this.config = $.config;
        this.location = $.location;
        this.project = $.project;
        this.storedInfoTypeId = $.storedInfoTypeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StoredInfoTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StoredInfoTypeArgs $;

        public Builder() {
            $ = new StoredInfoTypeArgs();
        }

        public Builder(StoredInfoTypeArgs defaults) {
            $ = new StoredInfoTypeArgs(Objects.requireNonNull(defaults));
        }

        public Builder config(Output<GooglePrivacyDlpV2StoredInfoTypeConfigArgs> config) {
            $.config = config;
            return this;
        }

        public Builder config(GooglePrivacyDlpV2StoredInfoTypeConfigArgs config) {
            return config(Output.of(config));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder storedInfoTypeId(@Nullable Output<String> storedInfoTypeId) {
            $.storedInfoTypeId = storedInfoTypeId;
            return this;
        }

        public Builder storedInfoTypeId(String storedInfoTypeId) {
            return storedInfoTypeId(Output.of(storedInfoTypeId));
        }

        public StoredInfoTypeArgs build() {
            $.config = Objects.requireNonNull($.config, "expected parameter 'config' to be non-null");
            return $;
        }
    }

}
