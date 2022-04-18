// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.logging_v2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.logging_v2.inputs.BigQueryOptionsArgs;
import com.pulumi.googlenative.logging_v2.inputs.LogExclusionArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BillingAccountSinkArgs extends com.pulumi.resources.ResourceArgs {

    public static final BillingAccountSinkArgs Empty = new BillingAccountSinkArgs();

    /**
     * Optional. Options that affect sinks exporting data to BigQuery.
     * 
     */
    @Import(name="bigqueryOptions")
      private final @Nullable Output<BigQueryOptionsArgs> bigqueryOptions;

    public Output<BigQueryOptionsArgs> bigqueryOptions() {
        return this.bigqueryOptions == null ? Codegen.empty() : this.bigqueryOptions;
    }

    @Import(name="billingAccountId", required=true)
      private final Output<String> billingAccountId;

    public Output<String> billingAccountId() {
        return this.billingAccountId;
    }

    /**
     * Optional. A description of this sink.The maximum length of the description is 8000 characters.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The export destination: "storage.googleapis.com/[GCS_BUCKET]" "bigquery.googleapis.com/projects/[PROJECT_ID]/datasets/[DATASET]" "pubsub.googleapis.com/projects/[PROJECT_ID]/topics/[TOPIC_ID]" The sink's writer_identity, set when the sink is created, must have permission to write to the destination or else the log entries are not exported. For more information, see Exporting Logs with Sinks (https://cloud.google.com/logging/docs/api/tasks/exporting-logs).
     * 
     */
    @Import(name="destination", required=true)
      private final Output<String> destination;

    public Output<String> destination() {
        return this.destination;
    }

    /**
     * Optional. If set to true, then this sink is disabled and it does not export any log entries.
     * 
     */
    @Import(name="disabled")
      private final @Nullable Output<Boolean> disabled;

    public Output<Boolean> disabled() {
        return this.disabled == null ? Codegen.empty() : this.disabled;
    }

    /**
     * Optional. Log entries that match any of these exclusion filters will not be exported.If a log entry is matched by both filter and one of exclusion_filters it will not be exported.
     * 
     */
    @Import(name="exclusions")
      private final @Nullable Output<List<LogExclusionArgs>> exclusions;

    public Output<List<LogExclusionArgs>> exclusions() {
        return this.exclusions == null ? Codegen.empty() : this.exclusions;
    }

    /**
     * Optional. An advanced logs filter (https://cloud.google.com/logging/docs/view/advanced-queries). The only exported log entries are those that are in the resource owning the sink and that match the filter.For example:logName="projects/[PROJECT_ID]/logs/[LOG_ID]" AND severity>=ERROR
     * 
     */
    @Import(name="filter")
      private final @Nullable Output<String> filter;

    public Output<String> filter() {
        return this.filter == null ? Codegen.empty() : this.filter;
    }

    /**
     * Optional. This field applies only to sinks owned by organizations and folders. If the field is false, the default, only the logs owned by the sink's parent resource are available for export. If the field is true, then log entries from all the projects, folders, and billing accounts contained in the sink's parent resource are also available for export. Whether a particular log entry from the children is exported depends on the sink's filter expression.For example, if this field is true, then the filter resource.type=gce_instance would export all Compute Engine VM instance log entries from all projects in the sink's parent.To only export entries from certain child projects, filter on the project part of the log name:logName:("projects/test-project1/" OR "projects/test-project2/") AND resource.type=gce_instance
     * 
     */
    @Import(name="includeChildren")
      private final @Nullable Output<Boolean> includeChildren;

    public Output<Boolean> includeChildren() {
        return this.includeChildren == null ? Codegen.empty() : this.includeChildren;
    }

    /**
     * The client-assigned sink identifier, unique within the project.For example: "my-syslog-errors-to-pubsub". Sink identifiers are limited to 100 characters and can include only the following characters: upper and lower-case alphanumeric characters, underscores, hyphens, and periods. First character has to be alphanumeric.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="uniqueWriterIdentity")
      private final @Nullable Output<String> uniqueWriterIdentity;

    public Output<String> uniqueWriterIdentity() {
        return this.uniqueWriterIdentity == null ? Codegen.empty() : this.uniqueWriterIdentity;
    }

    public BillingAccountSinkArgs(
        @Nullable Output<BigQueryOptionsArgs> bigqueryOptions,
        Output<String> billingAccountId,
        @Nullable Output<String> description,
        Output<String> destination,
        @Nullable Output<Boolean> disabled,
        @Nullable Output<List<LogExclusionArgs>> exclusions,
        @Nullable Output<String> filter,
        @Nullable Output<Boolean> includeChildren,
        @Nullable Output<String> name,
        @Nullable Output<String> uniqueWriterIdentity) {
        this.bigqueryOptions = bigqueryOptions;
        this.billingAccountId = Objects.requireNonNull(billingAccountId, "expected parameter 'billingAccountId' to be non-null");
        this.description = description;
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
        this.disabled = disabled;
        this.exclusions = exclusions;
        this.filter = filter;
        this.includeChildren = includeChildren;
        this.name = name;
        this.uniqueWriterIdentity = uniqueWriterIdentity;
    }

    private BillingAccountSinkArgs() {
        this.bigqueryOptions = Codegen.empty();
        this.billingAccountId = Codegen.empty();
        this.description = Codegen.empty();
        this.destination = Codegen.empty();
        this.disabled = Codegen.empty();
        this.exclusions = Codegen.empty();
        this.filter = Codegen.empty();
        this.includeChildren = Codegen.empty();
        this.name = Codegen.empty();
        this.uniqueWriterIdentity = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BillingAccountSinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<BigQueryOptionsArgs> bigqueryOptions;
        private Output<String> billingAccountId;
        private @Nullable Output<String> description;
        private Output<String> destination;
        private @Nullable Output<Boolean> disabled;
        private @Nullable Output<List<LogExclusionArgs>> exclusions;
        private @Nullable Output<String> filter;
        private @Nullable Output<Boolean> includeChildren;
        private @Nullable Output<String> name;
        private @Nullable Output<String> uniqueWriterIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(BillingAccountSinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigqueryOptions = defaults.bigqueryOptions;
    	      this.billingAccountId = defaults.billingAccountId;
    	      this.description = defaults.description;
    	      this.destination = defaults.destination;
    	      this.disabled = defaults.disabled;
    	      this.exclusions = defaults.exclusions;
    	      this.filter = defaults.filter;
    	      this.includeChildren = defaults.includeChildren;
    	      this.name = defaults.name;
    	      this.uniqueWriterIdentity = defaults.uniqueWriterIdentity;
        }

        public Builder bigqueryOptions(@Nullable Output<BigQueryOptionsArgs> bigqueryOptions) {
            this.bigqueryOptions = bigqueryOptions;
            return this;
        }
        public Builder bigqueryOptions(@Nullable BigQueryOptionsArgs bigqueryOptions) {
            this.bigqueryOptions = Codegen.ofNullable(bigqueryOptions);
            return this;
        }
        public Builder billingAccountId(Output<String> billingAccountId) {
            this.billingAccountId = Objects.requireNonNull(billingAccountId);
            return this;
        }
        public Builder billingAccountId(String billingAccountId) {
            this.billingAccountId = Output.of(Objects.requireNonNull(billingAccountId));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder destination(Output<String> destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        public Builder destination(String destination) {
            this.destination = Output.of(Objects.requireNonNull(destination));
            return this;
        }
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }
        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = Codegen.ofNullable(disabled);
            return this;
        }
        public Builder exclusions(@Nullable Output<List<LogExclusionArgs>> exclusions) {
            this.exclusions = exclusions;
            return this;
        }
        public Builder exclusions(@Nullable List<LogExclusionArgs> exclusions) {
            this.exclusions = Codegen.ofNullable(exclusions);
            return this;
        }
        public Builder exclusions(LogExclusionArgs... exclusions) {
            return exclusions(List.of(exclusions));
        }
        public Builder filter(@Nullable Output<String> filter) {
            this.filter = filter;
            return this;
        }
        public Builder filter(@Nullable String filter) {
            this.filter = Codegen.ofNullable(filter);
            return this;
        }
        public Builder includeChildren(@Nullable Output<Boolean> includeChildren) {
            this.includeChildren = includeChildren;
            return this;
        }
        public Builder includeChildren(@Nullable Boolean includeChildren) {
            this.includeChildren = Codegen.ofNullable(includeChildren);
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
        public Builder uniqueWriterIdentity(@Nullable Output<String> uniqueWriterIdentity) {
            this.uniqueWriterIdentity = uniqueWriterIdentity;
            return this;
        }
        public Builder uniqueWriterIdentity(@Nullable String uniqueWriterIdentity) {
            this.uniqueWriterIdentity = Codegen.ofNullable(uniqueWriterIdentity);
            return this;
        }        public BillingAccountSinkArgs build() {
            return new BillingAccountSinkArgs(bigqueryOptions, billingAccountId, description, destination, disabled, exclusions, filter, includeChildren, name, uniqueWriterIdentity);
        }
    }
}
