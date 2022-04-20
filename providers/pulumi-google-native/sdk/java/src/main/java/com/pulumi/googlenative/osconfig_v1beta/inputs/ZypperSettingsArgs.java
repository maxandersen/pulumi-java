// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Zypper patching is performed by running `zypper patch`. See also https://en.opensuse.org/SDB:Zypper_manual.
 * 
 */
public final class ZypperSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZypperSettingsArgs Empty = new ZypperSettingsArgs();

    /**
     * Install only patches with these categories. Common categories include security, recommended, and feature.
     * 
     */
    @Import(name="categories")
      private final @Nullable Output<List<String>> categories;

    public Output<List<String>> categories() {
        return this.categories == null ? Codegen.empty() : this.categories;
    }

    /**
     * List of patches to exclude from update.
     * 
     */
    @Import(name="excludes")
      private final @Nullable Output<List<String>> excludes;

    public Output<List<String>> excludes() {
        return this.excludes == null ? Codegen.empty() : this.excludes;
    }

    /**
     * An exclusive list of patches to be updated. These are the only patches that will be installed using &#39;zypper patch patch:&#39; command. This field must not be used with any other patch configuration fields.
     * 
     */
    @Import(name="exclusivePatches")
      private final @Nullable Output<List<String>> exclusivePatches;

    public Output<List<String>> exclusivePatches() {
        return this.exclusivePatches == null ? Codegen.empty() : this.exclusivePatches;
    }

    /**
     * Install only patches with these severities. Common severities include critical, important, moderate, and low.
     * 
     */
    @Import(name="severities")
      private final @Nullable Output<List<String>> severities;

    public Output<List<String>> severities() {
        return this.severities == null ? Codegen.empty() : this.severities;
    }

    /**
     * Adds the `--with-optional` flag to `zypper patch`.
     * 
     */
    @Import(name="withOptional")
      private final @Nullable Output<Boolean> withOptional;

    public Output<Boolean> withOptional() {
        return this.withOptional == null ? Codegen.empty() : this.withOptional;
    }

    /**
     * Adds the `--with-update` flag, to `zypper patch`.
     * 
     */
    @Import(name="withUpdate")
      private final @Nullable Output<Boolean> withUpdate;

    public Output<Boolean> withUpdate() {
        return this.withUpdate == null ? Codegen.empty() : this.withUpdate;
    }

    public ZypperSettingsArgs(
        @Nullable Output<List<String>> categories,
        @Nullable Output<List<String>> excludes,
        @Nullable Output<List<String>> exclusivePatches,
        @Nullable Output<List<String>> severities,
        @Nullable Output<Boolean> withOptional,
        @Nullable Output<Boolean> withUpdate) {
        this.categories = categories;
        this.excludes = excludes;
        this.exclusivePatches = exclusivePatches;
        this.severities = severities;
        this.withOptional = withOptional;
        this.withUpdate = withUpdate;
    }

    private ZypperSettingsArgs() {
        this.categories = Codegen.empty();
        this.excludes = Codegen.empty();
        this.exclusivePatches = Codegen.empty();
        this.severities = Codegen.empty();
        this.withOptional = Codegen.empty();
        this.withUpdate = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZypperSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> categories;
        private @Nullable Output<List<String>> excludes;
        private @Nullable Output<List<String>> exclusivePatches;
        private @Nullable Output<List<String>> severities;
        private @Nullable Output<Boolean> withOptional;
        private @Nullable Output<Boolean> withUpdate;

        public Builder() {
    	      // Empty
        }

        public Builder(ZypperSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categories = defaults.categories;
    	      this.excludes = defaults.excludes;
    	      this.exclusivePatches = defaults.exclusivePatches;
    	      this.severities = defaults.severities;
    	      this.withOptional = defaults.withOptional;
    	      this.withUpdate = defaults.withUpdate;
        }

        public Builder categories(@Nullable Output<List<String>> categories) {
            this.categories = categories;
            return this;
        }
        public Builder categories(@Nullable List<String> categories) {
            this.categories = Codegen.ofNullable(categories);
            return this;
        }
        public Builder categories(String... categories) {
            return categories(List.of(categories));
        }
        public Builder excludes(@Nullable Output<List<String>> excludes) {
            this.excludes = excludes;
            return this;
        }
        public Builder excludes(@Nullable List<String> excludes) {
            this.excludes = Codegen.ofNullable(excludes);
            return this;
        }
        public Builder excludes(String... excludes) {
            return excludes(List.of(excludes));
        }
        public Builder exclusivePatches(@Nullable Output<List<String>> exclusivePatches) {
            this.exclusivePatches = exclusivePatches;
            return this;
        }
        public Builder exclusivePatches(@Nullable List<String> exclusivePatches) {
            this.exclusivePatches = Codegen.ofNullable(exclusivePatches);
            return this;
        }
        public Builder exclusivePatches(String... exclusivePatches) {
            return exclusivePatches(List.of(exclusivePatches));
        }
        public Builder severities(@Nullable Output<List<String>> severities) {
            this.severities = severities;
            return this;
        }
        public Builder severities(@Nullable List<String> severities) {
            this.severities = Codegen.ofNullable(severities);
            return this;
        }
        public Builder severities(String... severities) {
            return severities(List.of(severities));
        }
        public Builder withOptional(@Nullable Output<Boolean> withOptional) {
            this.withOptional = withOptional;
            return this;
        }
        public Builder withOptional(@Nullable Boolean withOptional) {
            this.withOptional = Codegen.ofNullable(withOptional);
            return this;
        }
        public Builder withUpdate(@Nullable Output<Boolean> withUpdate) {
            this.withUpdate = withUpdate;
            return this;
        }
        public Builder withUpdate(@Nullable Boolean withUpdate) {
            this.withUpdate = Codegen.ofNullable(withUpdate);
            return this;
        }        public ZypperSettingsArgs build() {
            return new ZypperSettingsArgs(categories, excludes, exclusivePatches, severities, withOptional, withUpdate);
        }
    }
}
