// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.greengrassv2.inputs;

import com.pulumi.awsnative.greengrassv2.enums.ComponentVersionLambdaFilesystemPermission;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ComponentVersionLambdaVolumeMountArgs extends com.pulumi.resources.ResourceArgs {

    public static final ComponentVersionLambdaVolumeMountArgs Empty = new ComponentVersionLambdaVolumeMountArgs();

    @Import(name="addGroupOwner")
    private @Nullable Output<Boolean> addGroupOwner;

    public Optional<Output<Boolean>> addGroupOwner() {
        return Optional.ofNullable(this.addGroupOwner);
    }

    @Import(name="destinationPath")
    private @Nullable Output<String> destinationPath;

    public Optional<Output<String>> destinationPath() {
        return Optional.ofNullable(this.destinationPath);
    }

    @Import(name="permission")
    private @Nullable Output<ComponentVersionLambdaFilesystemPermission> permission;

    public Optional<Output<ComponentVersionLambdaFilesystemPermission>> permission() {
        return Optional.ofNullable(this.permission);
    }

    @Import(name="sourcePath")
    private @Nullable Output<String> sourcePath;

    public Optional<Output<String>> sourcePath() {
        return Optional.ofNullable(this.sourcePath);
    }

    private ComponentVersionLambdaVolumeMountArgs() {}

    private ComponentVersionLambdaVolumeMountArgs(ComponentVersionLambdaVolumeMountArgs $) {
        this.addGroupOwner = $.addGroupOwner;
        this.destinationPath = $.destinationPath;
        this.permission = $.permission;
        this.sourcePath = $.sourcePath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ComponentVersionLambdaVolumeMountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ComponentVersionLambdaVolumeMountArgs $;

        public Builder() {
            $ = new ComponentVersionLambdaVolumeMountArgs();
        }

        public Builder(ComponentVersionLambdaVolumeMountArgs defaults) {
            $ = new ComponentVersionLambdaVolumeMountArgs(Objects.requireNonNull(defaults));
        }

        public Builder addGroupOwner(@Nullable Output<Boolean> addGroupOwner) {
            $.addGroupOwner = addGroupOwner;
            return this;
        }

        public Builder addGroupOwner(Boolean addGroupOwner) {
            return addGroupOwner(Output.of(addGroupOwner));
        }

        public Builder destinationPath(@Nullable Output<String> destinationPath) {
            $.destinationPath = destinationPath;
            return this;
        }

        public Builder destinationPath(String destinationPath) {
            return destinationPath(Output.of(destinationPath));
        }

        public Builder permission(@Nullable Output<ComponentVersionLambdaFilesystemPermission> permission) {
            $.permission = permission;
            return this;
        }

        public Builder permission(ComponentVersionLambdaFilesystemPermission permission) {
            return permission(Output.of(permission));
        }

        public Builder sourcePath(@Nullable Output<String> sourcePath) {
            $.sourcePath = sourcePath;
            return this;
        }

        public Builder sourcePath(String sourcePath) {
            return sourcePath(Output.of(sourcePath));
        }

        public ComponentVersionLambdaVolumeMountArgs build() {
            return $;
        }
    }

}
