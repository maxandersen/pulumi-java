// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PatchDeploymentPatchConfigWindowsUpdateArgs extends com.pulumi.resources.ResourceArgs {

    public static final PatchDeploymentPatchConfigWindowsUpdateArgs Empty = new PatchDeploymentPatchConfigWindowsUpdateArgs();

    /**
     * Only apply updates of these windows update classifications. If empty, all updates are applied.
     * Each value may be one of `CRITICAL`, `SECURITY`, `DEFINITION`, `DRIVER`, `FEATURE_PACK`, `SERVICE_PACK`, `TOOL`, `UPDATE_ROLLUP`, and `UPDATE`.
     * 
     */
    @Import(name="classifications")
    private @Nullable Output<List<String>> classifications;

    public Optional<Output<List<String>>> classifications() {
        return Optional.ofNullable(this.classifications);
    }

    /**
     * List of KBs to exclude from update.
     * 
     */
    @Import(name="excludes")
    private @Nullable Output<List<String>> excludes;

    public Optional<Output<List<String>>> excludes() {
        return Optional.ofNullable(this.excludes);
    }

    /**
     * An exclusive list of kbs to be updated. These are the only patches that will be updated.
     * This field must not be used with other patch configurations.
     * 
     */
    @Import(name="exclusivePatches")
    private @Nullable Output<List<String>> exclusivePatches;

    public Optional<Output<List<String>>> exclusivePatches() {
        return Optional.ofNullable(this.exclusivePatches);
    }

    private PatchDeploymentPatchConfigWindowsUpdateArgs() {}

    private PatchDeploymentPatchConfigWindowsUpdateArgs(PatchDeploymentPatchConfigWindowsUpdateArgs $) {
        this.classifications = $.classifications;
        this.excludes = $.excludes;
        this.exclusivePatches = $.exclusivePatches;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PatchDeploymentPatchConfigWindowsUpdateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PatchDeploymentPatchConfigWindowsUpdateArgs $;

        public Builder() {
            $ = new PatchDeploymentPatchConfigWindowsUpdateArgs();
        }

        public Builder(PatchDeploymentPatchConfigWindowsUpdateArgs defaults) {
            $ = new PatchDeploymentPatchConfigWindowsUpdateArgs(Objects.requireNonNull(defaults));
        }

        public Builder classifications(@Nullable Output<List<String>> classifications) {
            $.classifications = classifications;
            return this;
        }

        public Builder classifications(List<String> classifications) {
            return classifications(Output.of(classifications));
        }

        public Builder classifications(String... classifications) {
            return classifications(List.of(classifications));
        }

        public Builder excludes(@Nullable Output<List<String>> excludes) {
            $.excludes = excludes;
            return this;
        }

        public Builder excludes(List<String> excludes) {
            return excludes(Output.of(excludes));
        }

        public Builder excludes(String... excludes) {
            return excludes(List.of(excludes));
        }

        public Builder exclusivePatches(@Nullable Output<List<String>> exclusivePatches) {
            $.exclusivePatches = exclusivePatches;
            return this;
        }

        public Builder exclusivePatches(List<String> exclusivePatches) {
            return exclusivePatches(Output.of(exclusivePatches));
        }

        public Builder exclusivePatches(String... exclusivePatches) {
            return exclusivePatches(List.of(exclusivePatches));
        }

        public PatchDeploymentPatchConfigWindowsUpdateArgs build() {
            return $;
        }
    }

}
