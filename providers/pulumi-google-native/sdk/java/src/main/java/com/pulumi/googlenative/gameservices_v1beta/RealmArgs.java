// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gameservices_v1beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RealmArgs extends com.pulumi.resources.ResourceArgs {

    public static final RealmArgs Empty = new RealmArgs();

    /**
     * Human readable description of the realm.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * ETag of the resource.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> etag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    /**
     * The labels associated with this realm. Each label is a key-value pair.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The resource name of the realm, in the following form: `projects/{project}/locations/{location}/realms/{realm}`. For example, `projects/my-project/locations/{location}/realms/my-realm`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="realmId", required=true)
      private final Output<String> realmId;

    public Output<String> realmId() {
        return this.realmId;
    }

    /**
     * Time zone where all policies targeting this realm are evaluated. The value of this field must be from the IANA time zone database: https://www.iana.org/time-zones.
     * 
     */
    @Import(name="timeZone", required=true)
      private final Output<String> timeZone;

    public Output<String> timeZone() {
        return this.timeZone;
    }

    public RealmArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> etag,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        Output<String> realmId,
        Output<String> timeZone) {
        this.description = description;
        this.etag = etag;
        this.labels = labels;
        this.location = location;
        this.name = name;
        this.project = project;
        this.realmId = Objects.requireNonNull(realmId, "expected parameter 'realmId' to be non-null");
        this.timeZone = Objects.requireNonNull(timeZone, "expected parameter 'timeZone' to be non-null");
    }

    private RealmArgs() {
        this.description = Codegen.empty();
        this.etag = Codegen.empty();
        this.labels = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.realmId = Codegen.empty();
        this.timeZone = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RealmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> etag;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private Output<String> realmId;
        private Output<String> timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(RealmArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.realmId = defaults.realmId;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Codegen.ofNullable(etag);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
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
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder realmId(Output<String> realmId) {
            this.realmId = Objects.requireNonNull(realmId);
            return this;
        }
        public Builder realmId(String realmId) {
            this.realmId = Output.of(Objects.requireNonNull(realmId));
            return this;
        }
        public Builder timeZone(Output<String> timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }
        public Builder timeZone(String timeZone) {
            this.timeZone = Output.of(Objects.requireNonNull(timeZone));
            return this;
        }        public RealmArgs build() {
            return new RealmArgs(description, etag, labels, location, name, project, realmId, timeZone);
        }
    }
}
