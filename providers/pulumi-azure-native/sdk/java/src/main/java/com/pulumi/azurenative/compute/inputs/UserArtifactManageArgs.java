// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserArtifactManageArgs extends ResourceArgs {

    public static final UserArtifactManageArgs Empty = new UserArtifactManageArgs();

    /**
     * Required. The path and arguments to install the gallery application. This is limited to 4096 characters.
     * 
     */
    @Import(name="install", required=true)
    private Output<String> install;

    /**
     * @return Required. The path and arguments to install the gallery application. This is limited to 4096 characters.
     * 
     */
    public Output<String> install() {
        return this.install;
    }

    /**
     * Required. The path and arguments to remove the gallery application. This is limited to 4096 characters.
     * 
     */
    @Import(name="remove", required=true)
    private Output<String> remove;

    /**
     * @return Required. The path and arguments to remove the gallery application. This is limited to 4096 characters.
     * 
     */
    public Output<String> remove() {
        return this.remove;
    }

    /**
     * Optional. The path and arguments to update the gallery application. If not present, then update operation will invoke remove command on the previous version and install command on the current version of the gallery application. This is limited to 4096 characters.
     * 
     */
    @Import(name="update")
    private @Nullable Output<String> update;

    /**
     * @return Optional. The path and arguments to update the gallery application. If not present, then update operation will invoke remove command on the previous version and install command on the current version of the gallery application. This is limited to 4096 characters.
     * 
     */
    public Optional<Output<String>> update() {
        return Optional.ofNullable(this.update);
    }

    private UserArtifactManageArgs() {}

    private UserArtifactManageArgs(UserArtifactManageArgs $) {
        this.install = $.install;
        this.remove = $.remove;
        this.update = $.update;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserArtifactManageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserArtifactManageArgs $;

        public Builder() {
            $ = new UserArtifactManageArgs();
        }

        public Builder(UserArtifactManageArgs defaults) {
            $ = new UserArtifactManageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param install Required. The path and arguments to install the gallery application. This is limited to 4096 characters.
         * 
         * @return builder
         * 
         */
        public Builder install(Output<String> install) {
            $.install = install;
            return this;
        }

        /**
         * @param install Required. The path and arguments to install the gallery application. This is limited to 4096 characters.
         * 
         * @return builder
         * 
         */
        public Builder install(String install) {
            return install(Output.of(install));
        }

        /**
         * @param remove Required. The path and arguments to remove the gallery application. This is limited to 4096 characters.
         * 
         * @return builder
         * 
         */
        public Builder remove(Output<String> remove) {
            $.remove = remove;
            return this;
        }

        /**
         * @param remove Required. The path and arguments to remove the gallery application. This is limited to 4096 characters.
         * 
         * @return builder
         * 
         */
        public Builder remove(String remove) {
            return remove(Output.of(remove));
        }

        /**
         * @param update Optional. The path and arguments to update the gallery application. If not present, then update operation will invoke remove command on the previous version and install command on the current version of the gallery application. This is limited to 4096 characters.
         * 
         * @return builder
         * 
         */
        public Builder update(@Nullable Output<String> update) {
            $.update = update;
            return this;
        }

        /**
         * @param update Optional. The path and arguments to update the gallery application. If not present, then update operation will invoke remove command on the previous version and install command on the current version of the gallery application. This is limited to 4096 characters.
         * 
         * @return builder
         * 
         */
        public Builder update(String update) {
            return update(Output.of(update));
        }

        public UserArtifactManageArgs build() {
            $.install = Objects.requireNonNull($.install, "expected parameter 'install' to be non-null");
            $.remove = Objects.requireNonNull($.remove, "expected parameter 'remove' to be non-null");
            return $;
        }
    }

}
