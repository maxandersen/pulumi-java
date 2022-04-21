// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iam;

import com.pulumi.awsnative.iam.inputs.VirtualMFADeviceTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualMFADeviceArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMFADeviceArgs Empty = new VirtualMFADeviceArgs();

    @Import(name="path")
    private @Nullable Output<String> path;

    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    @Import(name="tags")
    private @Nullable Output<List<VirtualMFADeviceTagArgs>> tags;

    public Optional<Output<List<VirtualMFADeviceTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="users", required=true)
    private Output<List<String>> users;

    public Output<List<String>> users() {
        return this.users;
    }

    @Import(name="virtualMfaDeviceName")
    private @Nullable Output<String> virtualMfaDeviceName;

    public Optional<Output<String>> virtualMfaDeviceName() {
        return Optional.ofNullable(this.virtualMfaDeviceName);
    }

    private VirtualMFADeviceArgs() {}

    private VirtualMFADeviceArgs(VirtualMFADeviceArgs $) {
        this.path = $.path;
        this.tags = $.tags;
        this.users = $.users;
        this.virtualMfaDeviceName = $.virtualMfaDeviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMFADeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMFADeviceArgs $;

        public Builder() {
            $ = new VirtualMFADeviceArgs();
        }

        public Builder(VirtualMFADeviceArgs defaults) {
            $ = new VirtualMFADeviceArgs(Objects.requireNonNull(defaults));
        }

        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        public Builder path(String path) {
            return path(Output.of(path));
        }

        public Builder tags(@Nullable Output<List<VirtualMFADeviceTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<VirtualMFADeviceTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(VirtualMFADeviceTagArgs... tags) {
            return tags(List.of(tags));
        }

        public Builder users(Output<List<String>> users) {
            $.users = users;
            return this;
        }

        public Builder users(List<String> users) {
            return users(Output.of(users));
        }

        public Builder users(String... users) {
            return users(List.of(users));
        }

        public Builder virtualMfaDeviceName(@Nullable Output<String> virtualMfaDeviceName) {
            $.virtualMfaDeviceName = virtualMfaDeviceName;
            return this;
        }

        public Builder virtualMfaDeviceName(String virtualMfaDeviceName) {
            return virtualMfaDeviceName(Output.of(virtualMfaDeviceName));
        }

        public VirtualMFADeviceArgs build() {
            $.users = Objects.requireNonNull($.users, "expected parameter 'users' to be non-null");
            return $;
        }
    }

}
