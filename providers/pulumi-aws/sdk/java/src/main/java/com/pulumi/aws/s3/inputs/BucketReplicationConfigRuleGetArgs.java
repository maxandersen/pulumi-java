// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDeleteMarkerReplicationGetArgs;
import com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationGetArgs;
import com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleExistingObjectReplicationGetArgs;
import com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleFilterGetArgs;
import com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleSourceSelectionCriteriaGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketReplicationConfigRuleGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigRuleGetArgs Empty = new BucketReplicationConfigRuleGetArgs();

    /**
     * Whether delete markers are replicated. This argument is only valid with V2 replication configurations (i.e., when `filter` is used)documented below.
     * 
     */
    @Import(name="deleteMarkerReplication")
      private final @Nullable Output<BucketReplicationConfigRuleDeleteMarkerReplicationGetArgs> deleteMarkerReplication;

    public Output<BucketReplicationConfigRuleDeleteMarkerReplicationGetArgs> deleteMarkerReplication() {
        return this.deleteMarkerReplication == null ? Codegen.empty() : this.deleteMarkerReplication;
    }

    /**
     * Specifies the destination for the rule documented below.
     * 
     */
    @Import(name="destination", required=true)
      private final Output<BucketReplicationConfigRuleDestinationGetArgs> destination;

    public Output<BucketReplicationConfigRuleDestinationGetArgs> destination() {
        return this.destination;
    }

    /**
     * Replicate existing objects in the source bucket according to the rule configurations documented below.
     * 
     */
    @Import(name="existingObjectReplication")
      private final @Nullable Output<BucketReplicationConfigRuleExistingObjectReplicationGetArgs> existingObjectReplication;

    public Output<BucketReplicationConfigRuleExistingObjectReplicationGetArgs> existingObjectReplication() {
        return this.existingObjectReplication == null ? Codegen.empty() : this.existingObjectReplication;
    }

    /**
     * Filter that identifies subset of objects to which the replication rule applies documented below.
     * 
     */
    @Import(name="filter")
      private final @Nullable Output<BucketReplicationConfigRuleFilterGetArgs> filter;

    public Output<BucketReplicationConfigRuleFilterGetArgs> filter() {
        return this.filter == null ? Codegen.empty() : this.filter;
    }

    /**
     * Unique identifier for the rule. Must be less than or equal to 255 characters in length.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> id() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * Object key name prefix identifying one or more objects to which the rule applies. Must be less than or equal to 1024 characters in length.
     * 
     */
    @Import(name="prefix")
      private final @Nullable Output<String> prefix;

    public Output<String> prefix() {
        return this.prefix == null ? Codegen.empty() : this.prefix;
    }

    /**
     * The priority associated with the rule. Priority should only be set if `filter` is configured. If not provided, defaults to `0`. Priority must be unique between multiple rules.
     * 
     */
    @Import(name="priority")
      private final @Nullable Output<Integer> priority;

    public Output<Integer> priority() {
        return this.priority == null ? Codegen.empty() : this.priority;
    }

    /**
     * Specifies special object selection criteria documented below.
     * 
     */
    @Import(name="sourceSelectionCriteria")
      private final @Nullable Output<BucketReplicationConfigRuleSourceSelectionCriteriaGetArgs> sourceSelectionCriteria;

    public Output<BucketReplicationConfigRuleSourceSelectionCriteriaGetArgs> sourceSelectionCriteria() {
        return this.sourceSelectionCriteria == null ? Codegen.empty() : this.sourceSelectionCriteria;
    }

    /**
     * The status of the rule. Either `&#34;Enabled&#34;` or `&#34;Disabled&#34;`. The rule is ignored if status is not &#34;Enabled&#34;.
     * 
     */
    @Import(name="status", required=true)
      private final Output<String> status;

    public Output<String> status() {
        return this.status;
    }

    public BucketReplicationConfigRuleGetArgs(
        @Nullable Output<BucketReplicationConfigRuleDeleteMarkerReplicationGetArgs> deleteMarkerReplication,
        Output<BucketReplicationConfigRuleDestinationGetArgs> destination,
        @Nullable Output<BucketReplicationConfigRuleExistingObjectReplicationGetArgs> existingObjectReplication,
        @Nullable Output<BucketReplicationConfigRuleFilterGetArgs> filter,
        @Nullable Output<String> id,
        @Nullable Output<String> prefix,
        @Nullable Output<Integer> priority,
        @Nullable Output<BucketReplicationConfigRuleSourceSelectionCriteriaGetArgs> sourceSelectionCriteria,
        Output<String> status) {
        this.deleteMarkerReplication = deleteMarkerReplication;
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
        this.existingObjectReplication = existingObjectReplication;
        this.filter = filter;
        this.id = id;
        this.prefix = prefix;
        this.priority = priority;
        this.sourceSelectionCriteria = sourceSelectionCriteria;
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private BucketReplicationConfigRuleGetArgs() {
        this.deleteMarkerReplication = Codegen.empty();
        this.destination = Codegen.empty();
        this.existingObjectReplication = Codegen.empty();
        this.filter = Codegen.empty();
        this.id = Codegen.empty();
        this.prefix = Codegen.empty();
        this.priority = Codegen.empty();
        this.sourceSelectionCriteria = Codegen.empty();
        this.status = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<BucketReplicationConfigRuleDeleteMarkerReplicationGetArgs> deleteMarkerReplication;
        private Output<BucketReplicationConfigRuleDestinationGetArgs> destination;
        private @Nullable Output<BucketReplicationConfigRuleExistingObjectReplicationGetArgs> existingObjectReplication;
        private @Nullable Output<BucketReplicationConfigRuleFilterGetArgs> filter;
        private @Nullable Output<String> id;
        private @Nullable Output<String> prefix;
        private @Nullable Output<Integer> priority;
        private @Nullable Output<BucketReplicationConfigRuleSourceSelectionCriteriaGetArgs> sourceSelectionCriteria;
        private Output<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigRuleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteMarkerReplication = defaults.deleteMarkerReplication;
    	      this.destination = defaults.destination;
    	      this.existingObjectReplication = defaults.existingObjectReplication;
    	      this.filter = defaults.filter;
    	      this.id = defaults.id;
    	      this.prefix = defaults.prefix;
    	      this.priority = defaults.priority;
    	      this.sourceSelectionCriteria = defaults.sourceSelectionCriteria;
    	      this.status = defaults.status;
        }

        public Builder deleteMarkerReplication(@Nullable Output<BucketReplicationConfigRuleDeleteMarkerReplicationGetArgs> deleteMarkerReplication) {
            this.deleteMarkerReplication = deleteMarkerReplication;
            return this;
        }
        public Builder deleteMarkerReplication(@Nullable BucketReplicationConfigRuleDeleteMarkerReplicationGetArgs deleteMarkerReplication) {
            this.deleteMarkerReplication = Codegen.ofNullable(deleteMarkerReplication);
            return this;
        }
        public Builder destination(Output<BucketReplicationConfigRuleDestinationGetArgs> destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        public Builder destination(BucketReplicationConfigRuleDestinationGetArgs destination) {
            this.destination = Output.of(Objects.requireNonNull(destination));
            return this;
        }
        public Builder existingObjectReplication(@Nullable Output<BucketReplicationConfigRuleExistingObjectReplicationGetArgs> existingObjectReplication) {
            this.existingObjectReplication = existingObjectReplication;
            return this;
        }
        public Builder existingObjectReplication(@Nullable BucketReplicationConfigRuleExistingObjectReplicationGetArgs existingObjectReplication) {
            this.existingObjectReplication = Codegen.ofNullable(existingObjectReplication);
            return this;
        }
        public Builder filter(@Nullable Output<BucketReplicationConfigRuleFilterGetArgs> filter) {
            this.filter = filter;
            return this;
        }
        public Builder filter(@Nullable BucketReplicationConfigRuleFilterGetArgs filter) {
            this.filter = Codegen.ofNullable(filter);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder prefix(@Nullable Output<String> prefix) {
            this.prefix = prefix;
            return this;
        }
        public Builder prefix(@Nullable String prefix) {
            this.prefix = Codegen.ofNullable(prefix);
            return this;
        }
        public Builder priority(@Nullable Output<Integer> priority) {
            this.priority = priority;
            return this;
        }
        public Builder priority(@Nullable Integer priority) {
            this.priority = Codegen.ofNullable(priority);
            return this;
        }
        public Builder sourceSelectionCriteria(@Nullable Output<BucketReplicationConfigRuleSourceSelectionCriteriaGetArgs> sourceSelectionCriteria) {
            this.sourceSelectionCriteria = sourceSelectionCriteria;
            return this;
        }
        public Builder sourceSelectionCriteria(@Nullable BucketReplicationConfigRuleSourceSelectionCriteriaGetArgs sourceSelectionCriteria) {
            this.sourceSelectionCriteria = Codegen.ofNullable(sourceSelectionCriteria);
            return this;
        }
        public Builder status(Output<String> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder status(String status) {
            this.status = Output.of(Objects.requireNonNull(status));
            return this;
        }        public BucketReplicationConfigRuleGetArgs build() {
            return new BucketReplicationConfigRuleGetArgs(deleteMarkerReplication, destination, existingObjectReplication, filter, id, prefix, priority, sourceSelectionCriteria, status);
        }
    }
}
