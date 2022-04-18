// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.events.k8s.io_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * EventSeries contain information on series of events, i.e. thing that was/is happening continuously for some time. How often to update the EventSeries is up to the event reporters. The default event reporter in "k8s.io/client-go/tools/events/event_broadcaster.go" shows how this struct is updated on heartbeats and can guide customized reporter implementations.
 * 
 */
public final class EventSeriesArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventSeriesArgs Empty = new EventSeriesArgs();

    /**
     * count is the number of occurrences in this series up to the last heartbeat time.
     * 
     */
    @Import(name="count", required=true)
      private final Output<Integer> count;

    public Output<Integer> count() {
        return this.count;
    }

    /**
     * lastObservedTime is the time when last Event from the series was seen before last heartbeat.
     * 
     */
    @Import(name="lastObservedTime", required=true)
      private final Output<String> lastObservedTime;

    public Output<String> lastObservedTime() {
        return this.lastObservedTime;
    }

    public EventSeriesArgs(
        Output<Integer> count,
        Output<String> lastObservedTime) {
        this.count = Objects.requireNonNull(count, "expected parameter 'count' to be non-null");
        this.lastObservedTime = Objects.requireNonNull(lastObservedTime, "expected parameter 'lastObservedTime' to be non-null");
    }

    private EventSeriesArgs() {
        this.count = Codegen.empty();
        this.lastObservedTime = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSeriesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> count;
        private Output<String> lastObservedTime;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSeriesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.lastObservedTime = defaults.lastObservedTime;
        }

        public Builder count(Output<Integer> count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        public Builder count(Integer count) {
            this.count = Output.of(Objects.requireNonNull(count));
            return this;
        }
        public Builder lastObservedTime(Output<String> lastObservedTime) {
            this.lastObservedTime = Objects.requireNonNull(lastObservedTime);
            return this;
        }
        public Builder lastObservedTime(String lastObservedTime) {
            this.lastObservedTime = Output.of(Objects.requireNonNull(lastObservedTime));
            return this;
        }        public EventSeriesArgs build() {
            return new EventSeriesArgs(count, lastObservedTime);
        }
    }
}
