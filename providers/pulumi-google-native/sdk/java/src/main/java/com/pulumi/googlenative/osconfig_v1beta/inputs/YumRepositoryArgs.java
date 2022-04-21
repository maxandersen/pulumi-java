// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a single Yum package repository. This repository is added to a repo file that is stored at `/etc/yum.repos.d/google_osconfig.repo`.
 * 
 */
public final class YumRepositoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final YumRepositoryArgs Empty = new YumRepositoryArgs();

    /**
     * The location of the repository directory.
     * 
     */
    @Import(name="baseUrl", required=true)
    private Output<String> baseUrl;

    public Output<String> baseUrl() {
        return this.baseUrl;
    }

    /**
     * The display name of the repository.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * URIs of GPG keys.
     * 
     */
    @Import(name="gpgKeys")
    private @Nullable Output<List<String>> gpgKeys;

    public Optional<Output<List<String>>> gpgKeys() {
        return Optional.ofNullable(this.gpgKeys);
    }

    /**
     * A one word, unique name for this repository. This is the `repo id` in the Yum config file and also the `display_name` if `display_name` is omitted. This id is also used as the unique identifier when checking for guest policy conflicts.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    public Output<String> id() {
        return this.id;
    }

    private YumRepositoryArgs() {}

    private YumRepositoryArgs(YumRepositoryArgs $) {
        this.baseUrl = $.baseUrl;
        this.displayName = $.displayName;
        this.gpgKeys = $.gpgKeys;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(YumRepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private YumRepositoryArgs $;

        public Builder() {
            $ = new YumRepositoryArgs();
        }

        public Builder(YumRepositoryArgs defaults) {
            $ = new YumRepositoryArgs(Objects.requireNonNull(defaults));
        }

        public Builder baseUrl(Output<String> baseUrl) {
            $.baseUrl = baseUrl;
            return this;
        }

        public Builder baseUrl(String baseUrl) {
            return baseUrl(Output.of(baseUrl));
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder gpgKeys(@Nullable Output<List<String>> gpgKeys) {
            $.gpgKeys = gpgKeys;
            return this;
        }

        public Builder gpgKeys(List<String> gpgKeys) {
            return gpgKeys(Output.of(gpgKeys));
        }

        public Builder gpgKeys(String... gpgKeys) {
            return gpgKeys(List.of(gpgKeys));
        }

        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public YumRepositoryArgs build() {
            $.baseUrl = Objects.requireNonNull($.baseUrl, "expected parameter 'baseUrl' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
