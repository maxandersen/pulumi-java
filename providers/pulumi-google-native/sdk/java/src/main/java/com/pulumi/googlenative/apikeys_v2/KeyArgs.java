// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apikeys_v2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.apikeys_v2.inputs.V2RestrictionsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final KeyArgs Empty = new KeyArgs();

    /**
     * Human-readable display name of this key that you can modify. The maximum length is 63 characters.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="keyId")
    private @Nullable Output<String> keyId;

    public Optional<Output<String>> keyId() {
        return Optional.ofNullable(this.keyId);
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
     * Key restrictions.
     * 
     */
    @Import(name="restrictions")
    private @Nullable Output<V2RestrictionsArgs> restrictions;

    public Optional<Output<V2RestrictionsArgs>> restrictions() {
        return Optional.ofNullable(this.restrictions);
    }

    private KeyArgs() {}

    private KeyArgs(KeyArgs $) {
        this.displayName = $.displayName;
        this.keyId = $.keyId;
        this.location = $.location;
        this.project = $.project;
        this.restrictions = $.restrictions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyArgs $;

        public Builder() {
            $ = new KeyArgs();
        }

        public Builder(KeyArgs defaults) {
            $ = new KeyArgs(Objects.requireNonNull(defaults));
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder keyId(@Nullable Output<String> keyId) {
            $.keyId = keyId;
            return this;
        }

        public Builder keyId(String keyId) {
            return keyId(Output.of(keyId));
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

        public Builder restrictions(@Nullable Output<V2RestrictionsArgs> restrictions) {
            $.restrictions = restrictions;
            return this;
        }

        public Builder restrictions(V2RestrictionsArgs restrictions) {
            return restrictions(Output.of(restrictions));
        }

        public KeyArgs build() {
            return $;
        }
    }

}
