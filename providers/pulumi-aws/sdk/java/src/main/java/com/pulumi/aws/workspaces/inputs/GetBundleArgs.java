// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.workspaces.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBundleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBundleArgs Empty = new GetBundleArgs();

    /**
     * The ID of the bundle.
     * 
     */
    @Import(name="bundleId")
    private @Nullable String bundleId;

    public Optional<String> bundleId() {
        return Optional.ofNullable(this.bundleId);
    }

    /**
     * The name of the bundle. You cannot combine this parameter with `bundle_id`.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The owner of the bundles. You have to leave it blank for own bundles. You cannot combine this parameter with `bundle_id`.
     * 
     */
    @Import(name="owner")
    private @Nullable String owner;

    public Optional<String> owner() {
        return Optional.ofNullable(this.owner);
    }

    private GetBundleArgs() {}

    private GetBundleArgs(GetBundleArgs $) {
        this.bundleId = $.bundleId;
        this.name = $.name;
        this.owner = $.owner;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBundleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBundleArgs $;

        public Builder() {
            $ = new GetBundleArgs();
        }

        public Builder(GetBundleArgs defaults) {
            $ = new GetBundleArgs(Objects.requireNonNull(defaults));
        }

        public Builder bundleId(@Nullable String bundleId) {
            $.bundleId = bundleId;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder owner(@Nullable String owner) {
            $.owner = owner;
            return this;
        }

        public GetBundleArgs build() {
            return $;
        }
    }

}
