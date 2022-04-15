// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization;

import io.pulumi.azurenative.authorization.enums.AccessReviewRecurrenceRangeType;
import io.pulumi.azurenative.authorization.enums.AccessReviewResult;
import io.pulumi.azurenative.authorization.inputs.AccessReviewHistoryInstanceArgs;
import io.pulumi.azurenative.authorization.inputs.AccessReviewScopeArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessReviewHistoryDefinitionByIdArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessReviewHistoryDefinitionByIdArgs Empty = new AccessReviewHistoryDefinitionByIdArgs();

    /**
     * Collection of review decisions which the history data should be filtered on. For example if Approve and Deny are supplied the data will only contain review results in which the decision maker approved or denied a review request.
     * 
     */
    @Import(name="decisions")
      private final @Nullable Output<List<Either<String,AccessReviewResult>>> decisions;

    public Output<List<Either<String,AccessReviewResult>>> decisions() {
        return this.decisions == null ? Codegen.empty() : this.decisions;
    }

    /**
     * The display name for the history definition.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * The DateTime when the review is scheduled to end. Required if type is endDate
     * 
     */
    @Import(name="endDate")
      private final @Nullable Output<String> endDate;

    public Output<String> endDate() {
        return this.endDate == null ? Codegen.empty() : this.endDate;
    }

    /**
     * The id of the access review history definition.
     * 
     */
    @Import(name="historyDefinitionId")
      private final @Nullable Output<String> historyDefinitionId;

    public Output<String> historyDefinitionId() {
        return this.historyDefinitionId == null ? Codegen.empty() : this.historyDefinitionId;
    }

    /**
     * Set of access review history instances for this history definition.
     * 
     */
    @Import(name="instances")
      private final @Nullable Output<List<AccessReviewHistoryInstanceArgs>> instances;

    public Output<List<AccessReviewHistoryInstanceArgs>> instances() {
        return this.instances == null ? Codegen.empty() : this.instances;
    }

    /**
     * The interval for recurrence. For a quarterly review, the interval is 3 for type : absoluteMonthly.
     * 
     */
    @Import(name="interval")
      private final @Nullable Output<Integer> interval;

    public Output<Integer> interval() {
        return this.interval == null ? Codegen.empty() : this.interval;
    }

    /**
     * The number of times to repeat the access review. Required and must be positive if type is numbered.
     * 
     */
    @Import(name="numberOfOccurrences")
      private final @Nullable Output<Integer> numberOfOccurrences;

    public Output<Integer> numberOfOccurrences() {
        return this.numberOfOccurrences == null ? Codegen.empty() : this.numberOfOccurrences;
    }

    /**
     * A collection of scopes used when selecting review history data
     * 
     */
    @Import(name="scopes")
      private final @Nullable Output<List<AccessReviewScopeArgs>> scopes;

    public Output<List<AccessReviewScopeArgs>> scopes() {
        return this.scopes == null ? Codegen.empty() : this.scopes;
    }

    /**
     * The DateTime when the review is scheduled to be start. This could be a date in the future. Required on create.
     * 
     */
    @Import(name="startDate")
      private final @Nullable Output<String> startDate;

    public Output<String> startDate() {
        return this.startDate == null ? Codegen.empty() : this.startDate;
    }

    /**
     * The recurrence range type. The possible values are: endDate, noEnd, numbered.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<Either<String,AccessReviewRecurrenceRangeType>> type;

    public Output<Either<String,AccessReviewRecurrenceRangeType>> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public AccessReviewHistoryDefinitionByIdArgs(
        @Nullable Output<List<Either<String,AccessReviewResult>>> decisions,
        @Nullable Output<String> displayName,
        @Nullable Output<String> endDate,
        @Nullable Output<String> historyDefinitionId,
        @Nullable Output<List<AccessReviewHistoryInstanceArgs>> instances,
        @Nullable Output<Integer> interval,
        @Nullable Output<Integer> numberOfOccurrences,
        @Nullable Output<List<AccessReviewScopeArgs>> scopes,
        @Nullable Output<String> startDate,
        @Nullable Output<Either<String,AccessReviewRecurrenceRangeType>> type) {
        this.decisions = decisions;
        this.displayName = displayName;
        this.endDate = endDate;
        this.historyDefinitionId = historyDefinitionId;
        this.instances = instances;
        this.interval = interval;
        this.numberOfOccurrences = numberOfOccurrences;
        this.scopes = scopes;
        this.startDate = startDate;
        this.type = type;
    }

    private AccessReviewHistoryDefinitionByIdArgs() {
        this.decisions = Codegen.empty();
        this.displayName = Codegen.empty();
        this.endDate = Codegen.empty();
        this.historyDefinitionId = Codegen.empty();
        this.instances = Codegen.empty();
        this.interval = Codegen.empty();
        this.numberOfOccurrences = Codegen.empty();
        this.scopes = Codegen.empty();
        this.startDate = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessReviewHistoryDefinitionByIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Either<String,AccessReviewResult>>> decisions;
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> endDate;
        private @Nullable Output<String> historyDefinitionId;
        private @Nullable Output<List<AccessReviewHistoryInstanceArgs>> instances;
        private @Nullable Output<Integer> interval;
        private @Nullable Output<Integer> numberOfOccurrences;
        private @Nullable Output<List<AccessReviewScopeArgs>> scopes;
        private @Nullable Output<String> startDate;
        private @Nullable Output<Either<String,AccessReviewRecurrenceRangeType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessReviewHistoryDefinitionByIdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.decisions = defaults.decisions;
    	      this.displayName = defaults.displayName;
    	      this.endDate = defaults.endDate;
    	      this.historyDefinitionId = defaults.historyDefinitionId;
    	      this.instances = defaults.instances;
    	      this.interval = defaults.interval;
    	      this.numberOfOccurrences = defaults.numberOfOccurrences;
    	      this.scopes = defaults.scopes;
    	      this.startDate = defaults.startDate;
    	      this.type = defaults.type;
        }

        public Builder decisions(@Nullable Output<List<Either<String,AccessReviewResult>>> decisions) {
            this.decisions = decisions;
            return this;
        }
        public Builder decisions(@Nullable List<Either<String,AccessReviewResult>> decisions) {
            this.decisions = Codegen.ofNullable(decisions);
            return this;
        }
        public Builder decisions(Either<String,AccessReviewResult>... decisions) {
            return decisions(List.of(decisions));
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder endDate(@Nullable Output<String> endDate) {
            this.endDate = endDate;
            return this;
        }
        public Builder endDate(@Nullable String endDate) {
            this.endDate = Codegen.ofNullable(endDate);
            return this;
        }
        public Builder historyDefinitionId(@Nullable Output<String> historyDefinitionId) {
            this.historyDefinitionId = historyDefinitionId;
            return this;
        }
        public Builder historyDefinitionId(@Nullable String historyDefinitionId) {
            this.historyDefinitionId = Codegen.ofNullable(historyDefinitionId);
            return this;
        }
        public Builder instances(@Nullable Output<List<AccessReviewHistoryInstanceArgs>> instances) {
            this.instances = instances;
            return this;
        }
        public Builder instances(@Nullable List<AccessReviewHistoryInstanceArgs> instances) {
            this.instances = Codegen.ofNullable(instances);
            return this;
        }
        public Builder instances(AccessReviewHistoryInstanceArgs... instances) {
            return instances(List.of(instances));
        }
        public Builder interval(@Nullable Output<Integer> interval) {
            this.interval = interval;
            return this;
        }
        public Builder interval(@Nullable Integer interval) {
            this.interval = Codegen.ofNullable(interval);
            return this;
        }
        public Builder numberOfOccurrences(@Nullable Output<Integer> numberOfOccurrences) {
            this.numberOfOccurrences = numberOfOccurrences;
            return this;
        }
        public Builder numberOfOccurrences(@Nullable Integer numberOfOccurrences) {
            this.numberOfOccurrences = Codegen.ofNullable(numberOfOccurrences);
            return this;
        }
        public Builder scopes(@Nullable Output<List<AccessReviewScopeArgs>> scopes) {
            this.scopes = scopes;
            return this;
        }
        public Builder scopes(@Nullable List<AccessReviewScopeArgs> scopes) {
            this.scopes = Codegen.ofNullable(scopes);
            return this;
        }
        public Builder scopes(AccessReviewScopeArgs... scopes) {
            return scopes(List.of(scopes));
        }
        public Builder startDate(@Nullable Output<String> startDate) {
            this.startDate = startDate;
            return this;
        }
        public Builder startDate(@Nullable String startDate) {
            this.startDate = Codegen.ofNullable(startDate);
            return this;
        }
        public Builder type(@Nullable Output<Either<String,AccessReviewRecurrenceRangeType>> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable Either<String,AccessReviewRecurrenceRangeType> type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public AccessReviewHistoryDefinitionByIdArgs build() {
            return new AccessReviewHistoryDefinitionByIdArgs(decisions, displayName, endDate, historyDefinitionId, instances, interval, numberOfOccurrences, scopes, startDate, type);
        }
    }
}
