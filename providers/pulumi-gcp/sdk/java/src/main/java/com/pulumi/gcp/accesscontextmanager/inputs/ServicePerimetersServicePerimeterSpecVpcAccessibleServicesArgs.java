// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimetersServicePerimeterSpecVpcAccessibleServicesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServicePerimetersServicePerimeterSpecVpcAccessibleServicesArgs Empty = new ServicePerimetersServicePerimeterSpecVpcAccessibleServicesArgs();

    /**
     * The list of APIs usable within the Service Perimeter.
     * Must be empty unless `enableRestriction` is True.
     * 
     */
    @Import(name="allowedServices")
      private final @Nullable Output<List<String>> allowedServices;

    public Output<List<String>> allowedServices() {
        return this.allowedServices == null ? Codegen.empty() : this.allowedServices;
    }

    /**
     * Whether to restrict API calls within the Service Perimeter to the
     * list of APIs specified in &#39;allowedServices&#39;.
     * 
     */
    @Import(name="enableRestriction")
      private final @Nullable Output<Boolean> enableRestriction;

    public Output<Boolean> enableRestriction() {
        return this.enableRestriction == null ? Codegen.empty() : this.enableRestriction;
    }

    public ServicePerimetersServicePerimeterSpecVpcAccessibleServicesArgs(
        @Nullable Output<List<String>> allowedServices,
        @Nullable Output<Boolean> enableRestriction) {
        this.allowedServices = allowedServices;
        this.enableRestriction = enableRestriction;
    }

    private ServicePerimetersServicePerimeterSpecVpcAccessibleServicesArgs() {
        this.allowedServices = Codegen.empty();
        this.enableRestriction = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimetersServicePerimeterSpecVpcAccessibleServicesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> allowedServices;
        private @Nullable Output<Boolean> enableRestriction;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimetersServicePerimeterSpecVpcAccessibleServicesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedServices = defaults.allowedServices;
    	      this.enableRestriction = defaults.enableRestriction;
        }

        public Builder allowedServices(@Nullable Output<List<String>> allowedServices) {
            this.allowedServices = allowedServices;
            return this;
        }
        public Builder allowedServices(@Nullable List<String> allowedServices) {
            this.allowedServices = Codegen.ofNullable(allowedServices);
            return this;
        }
        public Builder allowedServices(String... allowedServices) {
            return allowedServices(List.of(allowedServices));
        }
        public Builder enableRestriction(@Nullable Output<Boolean> enableRestriction) {
            this.enableRestriction = enableRestriction;
            return this;
        }
        public Builder enableRestriction(@Nullable Boolean enableRestriction) {
            this.enableRestriction = Codegen.ofNullable(enableRestriction);
            return this;
        }        public ServicePerimetersServicePerimeterSpecVpcAccessibleServicesArgs build() {
            return new ServicePerimetersServicePerimeterSpecVpcAccessibleServicesArgs(allowedServices, enableRestriction);
        }
    }
}
