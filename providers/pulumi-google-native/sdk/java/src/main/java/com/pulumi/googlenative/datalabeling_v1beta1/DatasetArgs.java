// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datalabeling_v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatasetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatasetArgs Empty = new DatasetArgs();

    /**
     * Optional. User-provided description of the annotation specification set. The description can be up to 10000 characters long.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The display name of the dataset. Maximum of 64 characters.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * Last time that the Dataset is migrated to AI Platform V2. If any of the AnnotatedDataset is migrated, the last_migration_time in Dataset is also updated.
     * 
     */
    @Import(name="lastMigrateTime")
    private @Nullable Output<String> lastMigrateTime;

    public Optional<Output<String>> lastMigrateTime() {
        return Optional.ofNullable(this.lastMigrateTime);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private DatasetArgs() {}

    private DatasetArgs(DatasetArgs $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.lastMigrateTime = $.lastMigrateTime;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetArgs $;

        public Builder() {
            $ = new DatasetArgs();
        }

        public Builder(DatasetArgs defaults) {
            $ = new DatasetArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder lastMigrateTime(@Nullable Output<String> lastMigrateTime) {
            $.lastMigrateTime = lastMigrateTime;
            return this;
        }

        public Builder lastMigrateTime(String lastMigrateTime) {
            return lastMigrateTime(Output.of(lastMigrateTime));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public DatasetArgs build() {
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            return $;
        }
    }

}
