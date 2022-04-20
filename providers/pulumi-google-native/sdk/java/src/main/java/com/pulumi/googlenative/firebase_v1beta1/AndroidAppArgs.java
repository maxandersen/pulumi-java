// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebase_v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AndroidAppArgs extends com.pulumi.resources.ResourceArgs {

    public static final AndroidAppArgs Empty = new AndroidAppArgs();

    /**
     * Immutable. The globally unique, Firebase-assigned identifier for the `AndroidApp`. This identifier should be treated as an opaque token, as the data format is not specified.
     * 
     */
    @Import(name="appId")
      private final @Nullable Output<String> appId;

    public Output<String> appId() {
        return this.appId == null ? Codegen.empty() : this.appId;
    }

    /**
     * The user-assigned display name for the `AndroidApp`.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * The resource name of the AndroidApp, in the format: projects/ PROJECT_IDENTIFIER/androidApps/APP_ID * PROJECT_IDENTIFIER: the parent Project&#39;s [`ProjectNumber`](../projects#FirebaseProject.FIELDS.project_number) ***(recommended)*** or its [`ProjectId`](../projects#FirebaseProject.FIELDS.project_id). Learn more about using project identifiers in Google&#39;s [AIP 2510 standard](https://google.aip.dev/cloud/2510). Note that the value for PROJECT_IDENTIFIER in any response body will be the `ProjectId`. * APP_ID: the globally unique, Firebase-assigned identifier for the App (see [`appId`](../projects.androidApps#AndroidApp.FIELDS.app_id)).
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Immutable. The canonical package name of the Android app as would appear in the Google Play Developer Console.
     * 
     */
    @Import(name="packageName")
      private final @Nullable Output<String> packageName;

    public Output<String> packageName() {
        return this.packageName == null ? Codegen.empty() : this.packageName;
    }

    /**
     * Immutable. A user-assigned unique identifier of the parent FirebaseProject for the `AndroidApp`.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    public AndroidAppArgs(
        @Nullable Output<String> appId,
        @Nullable Output<String> displayName,
        @Nullable Output<String> name,
        @Nullable Output<String> packageName,
        @Nullable Output<String> project) {
        this.appId = appId;
        this.displayName = displayName;
        this.name = name;
        this.packageName = packageName;
        this.project = project;
    }

    private AndroidAppArgs() {
        this.appId = Codegen.empty();
        this.displayName = Codegen.empty();
        this.name = Codegen.empty();
        this.packageName = Codegen.empty();
        this.project = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AndroidAppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> appId;
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> name;
        private @Nullable Output<String> packageName;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(AndroidAppArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.packageName = defaults.packageName;
    	      this.project = defaults.project;
        }

        public Builder appId(@Nullable Output<String> appId) {
            this.appId = appId;
            return this;
        }
        public Builder appId(@Nullable String appId) {
            this.appId = Codegen.ofNullable(appId);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder packageName(@Nullable Output<String> packageName) {
            this.packageName = packageName;
            return this;
        }
        public Builder packageName(@Nullable String packageName) {
            this.packageName = Codegen.ofNullable(packageName);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }        public AndroidAppArgs build() {
            return new AndroidAppArgs(appId, displayName, name, packageName, project);
        }
    }
}
