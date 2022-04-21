// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServicePerimetersServicePerimeterStatusVpcAccessibleServicesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServicePerimetersServicePerimeterStatusVpcAccessibleServicesArgs Empty = new ServicePerimetersServicePerimeterStatusVpcAccessibleServicesArgs();

    /**
     * The list of APIs usable within the Service Perimeter.
     * Must be empty unless `enableRestriction` is True.
     * 
     */
    @Import(name="allowedServices")
    private @Nullable Output<List<String>> allowedServices;

    public Optional<Output<List<String>>> allowedServices() {
        return Optional.ofNullable(this.allowedServices);
    }

    /**
     * Whether to restrict API calls within the Service Perimeter to the
     * list of APIs specified in &#39;allowedServices&#39;.
     * 
     */
    @Import(name="enableRestriction")
    private @Nullable Output<Boolean> enableRestriction;

    public Optional<Output<Boolean>> enableRestriction() {
        return Optional.ofNullable(this.enableRestriction);
    }

    private ServicePerimetersServicePerimeterStatusVpcAccessibleServicesArgs() {}

    private ServicePerimetersServicePerimeterStatusVpcAccessibleServicesArgs(ServicePerimetersServicePerimeterStatusVpcAccessibleServicesArgs $) {
        this.allowedServices = $.allowedServices;
        this.enableRestriction = $.enableRestriction;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicePerimetersServicePerimeterStatusVpcAccessibleServicesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicePerimetersServicePerimeterStatusVpcAccessibleServicesArgs $;

        public Builder() {
            $ = new ServicePerimetersServicePerimeterStatusVpcAccessibleServicesArgs();
        }

        public Builder(ServicePerimetersServicePerimeterStatusVpcAccessibleServicesArgs defaults) {
            $ = new ServicePerimetersServicePerimeterStatusVpcAccessibleServicesArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowedServices(@Nullable Output<List<String>> allowedServices) {
            $.allowedServices = allowedServices;
            return this;
        }

        public Builder allowedServices(List<String> allowedServices) {
            return allowedServices(Output.of(allowedServices));
        }

        public Builder allowedServices(String... allowedServices) {
            return allowedServices(List.of(allowedServices));
        }

        public Builder enableRestriction(@Nullable Output<Boolean> enableRestriction) {
            $.enableRestriction = enableRestriction;
            return this;
        }

        public Builder enableRestriction(Boolean enableRestriction) {
            return enableRestriction(Output.of(enableRestriction));
        }

        public ServicePerimetersServicePerimeterStatusVpcAccessibleServicesArgs build() {
            return $;
        }
    }

}
