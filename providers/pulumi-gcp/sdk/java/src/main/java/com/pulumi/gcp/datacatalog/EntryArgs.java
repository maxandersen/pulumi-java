// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datacatalog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.datacatalog.inputs.EntryGcsFilesetSpecArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EntryArgs extends com.pulumi.resources.ResourceArgs {

    public static final EntryArgs Empty = new EntryArgs();

    /**
     * Entry description, which can consist of several sentences or paragraphs that describe entry contents.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Display information such as title and description. A short name to identify the entry,
     * for example, &#34;Analytics Data - Jan 2011&#34;.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The name of the entry group this entry is in.
     * 
     */
    @Import(name="entryGroup", required=true)
    private Output<String> entryGroup;

    public Output<String> entryGroup() {
        return this.entryGroup;
    }

    /**
     * The id of the entry to create.
     * 
     */
    @Import(name="entryId", required=true)
    private Output<String> entryId;

    public Output<String> entryId() {
        return this.entryId;
    }

    /**
     * Specification that applies to a Cloud Storage fileset. This is only valid on entries of type FILESET.
     * Structure is documented below.
     * 
     */
    @Import(name="gcsFilesetSpec")
    private @Nullable Output<EntryGcsFilesetSpecArgs> gcsFilesetSpec;

    public Optional<Output<EntryGcsFilesetSpecArgs>> gcsFilesetSpec() {
        return Optional.ofNullable(this.gcsFilesetSpec);
    }

    /**
     * The resource this metadata entry refers to.
     * For Google Cloud Platform resources, linkedResource is the full name of the resource.
     * For example, the linkedResource for a table resource from BigQuery is:
     * //bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId
     * Output only when Entry is of type in the EntryType enum. For entries with userSpecifiedType,
     * this field is optional and defaults to an empty string.
     * 
     */
    @Import(name="linkedResource")
    private @Nullable Output<String> linkedResource;

    public Optional<Output<String>> linkedResource() {
        return Optional.ofNullable(this.linkedResource);
    }

    /**
     * Schema of the entry (e.g. BigQuery, GoogleSQL, Avro schema), as a json string. An entry might not have any schema
     * attached to it. See
     * https://cloud.google.com/data-catalog/docs/reference/rest/v1/projects.locations.entryGroups.entries#schema
     * for what fields this schema can contain.
     * 
     */
    @Import(name="schema")
    private @Nullable Output<String> schema;

    public Optional<Output<String>> schema() {
        return Optional.ofNullable(this.schema);
    }

    /**
     * The type of the entry. Only used for Entries with types in the EntryType enum.
     * Currently, only FILESET enum value is allowed. All other entries created through Data Catalog must use userSpecifiedType.
     * Possible values are `FILESET`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * This field indicates the entry&#39;s source system that Data Catalog does not integrate with.
     * userSpecifiedSystem strings must begin with a letter or underscore and can only contain letters, numbers,
     * and underscores; are case insensitive; must be at least 1 character and at most 64 characters long.
     * 
     */
    @Import(name="userSpecifiedSystem")
    private @Nullable Output<String> userSpecifiedSystem;

    public Optional<Output<String>> userSpecifiedSystem() {
        return Optional.ofNullable(this.userSpecifiedSystem);
    }

    /**
     * Entry type if it does not fit any of the input-allowed values listed in EntryType enum above.
     * When creating an entry, users should check the enum values first, if nothing matches the entry
     * to be created, then provide a custom value, for example &#34;my_special_type&#34;.
     * userSpecifiedType strings must begin with a letter or underscore and can only contain letters,
     * numbers, and underscores; are case insensitive; must be at least 1 character and at most 64 characters long.
     * 
     */
    @Import(name="userSpecifiedType")
    private @Nullable Output<String> userSpecifiedType;

    public Optional<Output<String>> userSpecifiedType() {
        return Optional.ofNullable(this.userSpecifiedType);
    }

    private EntryArgs() {}

    private EntryArgs(EntryArgs $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.entryGroup = $.entryGroup;
        this.entryId = $.entryId;
        this.gcsFilesetSpec = $.gcsFilesetSpec;
        this.linkedResource = $.linkedResource;
        this.schema = $.schema;
        this.type = $.type;
        this.userSpecifiedSystem = $.userSpecifiedSystem;
        this.userSpecifiedType = $.userSpecifiedType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EntryArgs $;

        public Builder() {
            $ = new EntryArgs();
        }

        public Builder(EntryArgs defaults) {
            $ = new EntryArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder entryGroup(Output<String> entryGroup) {
            $.entryGroup = entryGroup;
            return this;
        }

        public Builder entryGroup(String entryGroup) {
            return entryGroup(Output.of(entryGroup));
        }

        public Builder entryId(Output<String> entryId) {
            $.entryId = entryId;
            return this;
        }

        public Builder entryId(String entryId) {
            return entryId(Output.of(entryId));
        }

        public Builder gcsFilesetSpec(@Nullable Output<EntryGcsFilesetSpecArgs> gcsFilesetSpec) {
            $.gcsFilesetSpec = gcsFilesetSpec;
            return this;
        }

        public Builder gcsFilesetSpec(EntryGcsFilesetSpecArgs gcsFilesetSpec) {
            return gcsFilesetSpec(Output.of(gcsFilesetSpec));
        }

        public Builder linkedResource(@Nullable Output<String> linkedResource) {
            $.linkedResource = linkedResource;
            return this;
        }

        public Builder linkedResource(String linkedResource) {
            return linkedResource(Output.of(linkedResource));
        }

        public Builder schema(@Nullable Output<String> schema) {
            $.schema = schema;
            return this;
        }

        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder userSpecifiedSystem(@Nullable Output<String> userSpecifiedSystem) {
            $.userSpecifiedSystem = userSpecifiedSystem;
            return this;
        }

        public Builder userSpecifiedSystem(String userSpecifiedSystem) {
            return userSpecifiedSystem(Output.of(userSpecifiedSystem));
        }

        public Builder userSpecifiedType(@Nullable Output<String> userSpecifiedType) {
            $.userSpecifiedType = userSpecifiedType;
            return this;
        }

        public Builder userSpecifiedType(String userSpecifiedType) {
            return userSpecifiedType(Output.of(userSpecifiedType));
        }

        public EntryArgs build() {
            $.entryGroup = Objects.requireNonNull($.entryGroup, "expected parameter 'entryGroup' to be non-null");
            $.entryId = Objects.requireNonNull($.entryId, "expected parameter 'entryId' to be non-null");
            return $;
        }
    }

}
