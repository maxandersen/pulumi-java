// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudbuild.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TriggerBuildArtifactsObjectsTimingGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final TriggerBuildArtifactsObjectsTimingGetArgs Empty = new TriggerBuildArtifactsObjectsTimingGetArgs();

    /**
     * End of time span.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to
     * nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Import(name="endTime")
    private @Nullable Output<String> endTime;

    public Optional<Output<String>> endTime() {
        return Optional.ofNullable(this.endTime);
    }

    /**
     * Start of time span.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to
     * nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    private TriggerBuildArtifactsObjectsTimingGetArgs() {}

    private TriggerBuildArtifactsObjectsTimingGetArgs(TriggerBuildArtifactsObjectsTimingGetArgs $) {
        this.endTime = $.endTime;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TriggerBuildArtifactsObjectsTimingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TriggerBuildArtifactsObjectsTimingGetArgs $;

        public Builder() {
            $ = new TriggerBuildArtifactsObjectsTimingGetArgs();
        }

        public Builder(TriggerBuildArtifactsObjectsTimingGetArgs defaults) {
            $ = new TriggerBuildArtifactsObjectsTimingGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder endTime(@Nullable Output<String> endTime) {
            $.endTime = endTime;
            return this;
        }

        public Builder endTime(String endTime) {
            return endTime(Output.of(endTime));
        }

        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        public TriggerBuildArtifactsObjectsTimingGetArgs build() {
            return $;
        }
    }

}
