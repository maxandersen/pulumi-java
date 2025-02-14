// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Audit.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Audit.inputs.GetEventsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEventsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEventsArgs Empty = new GetEventsArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    /**
     * Returns events that were processed before this end date and time, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * 
     */
    @Import(name="endTime", required=true)
    private String endTime;

    /**
     * @return Returns events that were processed before this end date and time, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * 
     */
    public String endTime() {
        return this.endTime;
    }

    @Import(name="filters")
    private @Nullable List<GetEventsFilter> filters;

    public Optional<List<GetEventsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Returns events that were processed at or after this start date and time, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * 
     */
    @Import(name="startTime", required=true)
    private String startTime;

    /**
     * @return Returns events that were processed at or after this start date and time, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * 
     */
    public String startTime() {
        return this.startTime;
    }

    private GetEventsArgs() {}

    private GetEventsArgs(GetEventsArgs $) {
        this.compartmentId = $.compartmentId;
        this.endTime = $.endTime;
        this.filters = $.filters;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEventsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEventsArgs $;

        public Builder() {
            $ = new GetEventsArgs();
        }

        public Builder(GetEventsArgs defaults) {
            $ = new GetEventsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param endTime Returns events that were processed before this end date and time, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         * 
         * @return builder
         * 
         */
        public Builder endTime(String endTime) {
            $.endTime = endTime;
            return this;
        }

        public Builder filters(@Nullable List<GetEventsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetEventsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param startTime Returns events that were processed at or after this start date and time, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            $.startTime = startTime;
            return this;
        }

        public GetEventsArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            $.endTime = Objects.requireNonNull($.endTime, "expected parameter 'endTime' to be non-null");
            $.startTime = Objects.requireNonNull($.startTime, "expected parameter 'startTime' to be non-null");
            return $;
        }
    }

}
