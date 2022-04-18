// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appstream.outputs;

import com.pulumi.awsnative.appstream.outputs.ApplicationS3Location;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetApplicationResult {
    private final @Nullable String appBlockArn;
    private final @Nullable String arn;
    private final @Nullable List<String> attributesToDelete;
    private final @Nullable String createdTime;
    private final @Nullable String description;
    private final @Nullable String displayName;
    private final @Nullable ApplicationS3Location iconS3Location;
    private final @Nullable String launchParameters;
    private final @Nullable String launchPath;
    private final @Nullable String workingDirectory;

    @CustomType.Constructor
    private GetApplicationResult(
        @CustomType.Parameter("appBlockArn") @Nullable String appBlockArn,
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("attributesToDelete") @Nullable List<String> attributesToDelete,
        @CustomType.Parameter("createdTime") @Nullable String createdTime,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("iconS3Location") @Nullable ApplicationS3Location iconS3Location,
        @CustomType.Parameter("launchParameters") @Nullable String launchParameters,
        @CustomType.Parameter("launchPath") @Nullable String launchPath,
        @CustomType.Parameter("workingDirectory") @Nullable String workingDirectory) {
        this.appBlockArn = appBlockArn;
        this.arn = arn;
        this.attributesToDelete = attributesToDelete;
        this.createdTime = createdTime;
        this.description = description;
        this.displayName = displayName;
        this.iconS3Location = iconS3Location;
        this.launchParameters = launchParameters;
        this.launchPath = launchPath;
        this.workingDirectory = workingDirectory;
    }

    public Optional<String> appBlockArn() {
        return Optional.ofNullable(this.appBlockArn);
    }
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    public List<String> attributesToDelete() {
        return this.attributesToDelete == null ? List.of() : this.attributesToDelete;
    }
    public Optional<String> createdTime() {
        return Optional.ofNullable(this.createdTime);
    }
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    public Optional<ApplicationS3Location> iconS3Location() {
        return Optional.ofNullable(this.iconS3Location);
    }
    public Optional<String> launchParameters() {
        return Optional.ofNullable(this.launchParameters);
    }
    public Optional<String> launchPath() {
        return Optional.ofNullable(this.launchPath);
    }
    public Optional<String> workingDirectory() {
        return Optional.ofNullable(this.workingDirectory);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String appBlockArn;
        private @Nullable String arn;
        private @Nullable List<String> attributesToDelete;
        private @Nullable String createdTime;
        private @Nullable String description;
        private @Nullable String displayName;
        private @Nullable ApplicationS3Location iconS3Location;
        private @Nullable String launchParameters;
        private @Nullable String launchPath;
        private @Nullable String workingDirectory;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appBlockArn = defaults.appBlockArn;
    	      this.arn = defaults.arn;
    	      this.attributesToDelete = defaults.attributesToDelete;
    	      this.createdTime = defaults.createdTime;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.iconS3Location = defaults.iconS3Location;
    	      this.launchParameters = defaults.launchParameters;
    	      this.launchPath = defaults.launchPath;
    	      this.workingDirectory = defaults.workingDirectory;
        }

        public Builder appBlockArn(@Nullable String appBlockArn) {
            this.appBlockArn = appBlockArn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder attributesToDelete(@Nullable List<String> attributesToDelete) {
            this.attributesToDelete = attributesToDelete;
            return this;
        }
        public Builder attributesToDelete(String... attributesToDelete) {
            return attributesToDelete(List.of(attributesToDelete));
        }
        public Builder createdTime(@Nullable String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder iconS3Location(@Nullable ApplicationS3Location iconS3Location) {
            this.iconS3Location = iconS3Location;
            return this;
        }
        public Builder launchParameters(@Nullable String launchParameters) {
            this.launchParameters = launchParameters;
            return this;
        }
        public Builder launchPath(@Nullable String launchPath) {
            this.launchPath = launchPath;
            return this;
        }
        public Builder workingDirectory(@Nullable String workingDirectory) {
            this.workingDirectory = workingDirectory;
            return this;
        }        public GetApplicationResult build() {
            return new GetApplicationResult(appBlockArn, arn, attributesToDelete, createdTime, description, displayName, iconS3Location, launchParameters, launchPath, workingDirectory);
        }
    }
}
