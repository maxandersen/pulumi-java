// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.azurenative.eventgrid.inputs.BoolEqualsAdvancedFilterArgs;
import com.pulumi.azurenative.eventgrid.inputs.NumberGreaterThanAdvancedFilterArgs;
import com.pulumi.azurenative.eventgrid.inputs.NumberGreaterThanOrEqualsAdvancedFilterArgs;
import com.pulumi.azurenative.eventgrid.inputs.NumberInAdvancedFilterArgs;
import com.pulumi.azurenative.eventgrid.inputs.NumberLessThanAdvancedFilterArgs;
import com.pulumi.azurenative.eventgrid.inputs.NumberLessThanOrEqualsAdvancedFilterArgs;
import com.pulumi.azurenative.eventgrid.inputs.NumberNotInAdvancedFilterArgs;
import com.pulumi.azurenative.eventgrid.inputs.StringBeginsWithAdvancedFilterArgs;
import com.pulumi.azurenative.eventgrid.inputs.StringContainsAdvancedFilterArgs;
import com.pulumi.azurenative.eventgrid.inputs.StringEndsWithAdvancedFilterArgs;
import com.pulumi.azurenative.eventgrid.inputs.StringInAdvancedFilterArgs;
import com.pulumi.azurenative.eventgrid.inputs.StringNotInAdvancedFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Filter for the Event Subscription.
 * 
 */
public final class EventSubscriptionFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventSubscriptionFilterArgs Empty = new EventSubscriptionFilterArgs();

    /**
     * An array of advanced filters that are used for filtering event subscriptions.
     * 
     */
    @Import(name="advancedFilters")
    private @Nullable Output<List<Object>> advancedFilters;

    public Optional<Output<List<Object>>> advancedFilters() {
        return Optional.ofNullable(this.advancedFilters);
    }

    /**
     * A list of applicable event types that need to be part of the event subscription. If it is desired to subscribe to all default event types, set the IncludedEventTypes to null.
     * 
     */
    @Import(name="includedEventTypes")
    private @Nullable Output<List<String>> includedEventTypes;

    public Optional<Output<List<String>>> includedEventTypes() {
        return Optional.ofNullable(this.includedEventTypes);
    }

    /**
     * Specifies if the SubjectBeginsWith and SubjectEndsWith properties of the filter
     * should be compared in a case sensitive manner.
     * 
     */
    @Import(name="isSubjectCaseSensitive")
    private @Nullable Output<Boolean> isSubjectCaseSensitive;

    public Optional<Output<Boolean>> isSubjectCaseSensitive() {
        return Optional.ofNullable(this.isSubjectCaseSensitive);
    }

    /**
     * An optional string to filter events for an event subscription based on a resource path prefix.
     * The format of this depends on the publisher of the events.
     * Wildcard characters are not supported in this path.
     * 
     */
    @Import(name="subjectBeginsWith")
    private @Nullable Output<String> subjectBeginsWith;

    public Optional<Output<String>> subjectBeginsWith() {
        return Optional.ofNullable(this.subjectBeginsWith);
    }

    /**
     * An optional string to filter events for an event subscription based on a resource path suffix.
     * Wildcard characters are not supported in this path.
     * 
     */
    @Import(name="subjectEndsWith")
    private @Nullable Output<String> subjectEndsWith;

    public Optional<Output<String>> subjectEndsWith() {
        return Optional.ofNullable(this.subjectEndsWith);
    }

    private EventSubscriptionFilterArgs() {}

    private EventSubscriptionFilterArgs(EventSubscriptionFilterArgs $) {
        this.advancedFilters = $.advancedFilters;
        this.includedEventTypes = $.includedEventTypes;
        this.isSubjectCaseSensitive = $.isSubjectCaseSensitive;
        this.subjectBeginsWith = $.subjectBeginsWith;
        this.subjectEndsWith = $.subjectEndsWith;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventSubscriptionFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventSubscriptionFilterArgs $;

        public Builder() {
            $ = new EventSubscriptionFilterArgs();
        }

        public Builder(EventSubscriptionFilterArgs defaults) {
            $ = new EventSubscriptionFilterArgs(Objects.requireNonNull(defaults));
        }

        public Builder advancedFilters(@Nullable Output<List<Object>> advancedFilters) {
            $.advancedFilters = advancedFilters;
            return this;
        }

        public Builder advancedFilters(List<Object> advancedFilters) {
            return advancedFilters(Output.of(advancedFilters));
        }

        public Builder advancedFilters(Object... advancedFilters) {
            return advancedFilters(List.of(advancedFilters));
        }

        public Builder includedEventTypes(@Nullable Output<List<String>> includedEventTypes) {
            $.includedEventTypes = includedEventTypes;
            return this;
        }

        public Builder includedEventTypes(List<String> includedEventTypes) {
            return includedEventTypes(Output.of(includedEventTypes));
        }

        public Builder includedEventTypes(String... includedEventTypes) {
            return includedEventTypes(List.of(includedEventTypes));
        }

        public Builder isSubjectCaseSensitive(@Nullable Output<Boolean> isSubjectCaseSensitive) {
            $.isSubjectCaseSensitive = isSubjectCaseSensitive;
            return this;
        }

        public Builder isSubjectCaseSensitive(Boolean isSubjectCaseSensitive) {
            return isSubjectCaseSensitive(Output.of(isSubjectCaseSensitive));
        }

        public Builder subjectBeginsWith(@Nullable Output<String> subjectBeginsWith) {
            $.subjectBeginsWith = subjectBeginsWith;
            return this;
        }

        public Builder subjectBeginsWith(String subjectBeginsWith) {
            return subjectBeginsWith(Output.of(subjectBeginsWith));
        }

        public Builder subjectEndsWith(@Nullable Output<String> subjectEndsWith) {
            $.subjectEndsWith = subjectEndsWith;
            return this;
        }

        public Builder subjectEndsWith(String subjectEndsWith) {
            return subjectEndsWith(Output.of(subjectEndsWith));
        }

        public EventSubscriptionFilterArgs build() {
            $.isSubjectCaseSensitive = Codegen.booleanProp("isSubjectCaseSensitive").output().arg($.isSubjectCaseSensitive).def(false).getNullable();
            return $;
        }
    }

}
