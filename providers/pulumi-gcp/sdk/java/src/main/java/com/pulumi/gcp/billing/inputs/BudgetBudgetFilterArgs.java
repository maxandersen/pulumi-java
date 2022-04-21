// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.billing.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BudgetBudgetFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final BudgetBudgetFilterArgs Empty = new BudgetBudgetFilterArgs();

    /**
     * A set of subaccounts of the form billingAccounts/{account_id},
     * specifying that usage from only this set of subaccounts should
     * be included in the budget. If a subaccount is set to the name of
     * the parent account, usage from the parent account will be included.
     * If the field is omitted, the report will include usage from the parent
     * account and all subaccounts, if they exist.
     * 
     */
    @Import(name="creditTypes")
    private @Nullable Output<List<String>> creditTypes;

    public Optional<Output<List<String>>> creditTypes() {
        return Optional.ofNullable(this.creditTypes);
    }

    /**
     * Specifies how credits should be treated when determining spend
     * for threshold calculations.
     * Default value is `INCLUDE_ALL_CREDITS`.
     * Possible values are `INCLUDE_ALL_CREDITS`, `EXCLUDE_ALL_CREDITS`, and `INCLUDE_SPECIFIED_CREDITS`.
     * 
     */
    @Import(name="creditTypesTreatment")
    private @Nullable Output<String> creditTypesTreatment;

    public Optional<Output<String>> creditTypesTreatment() {
        return Optional.ofNullable(this.creditTypesTreatment);
    }

    /**
     * A single label and value pair specifying that usage from only
     * this set of labeled resources should be included in the budget.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * A set of projects of the form projects/{project_number},
     * specifying that usage from only this set of projects should be
     * included in the budget. If omitted, the report will include
     * all usage for the billing account, regardless of which project
     * the usage occurred on.
     * 
     */
    @Import(name="projects")
    private @Nullable Output<List<String>> projects;

    public Optional<Output<List<String>>> projects() {
        return Optional.ofNullable(this.projects);
    }

    /**
     * A set of services of the form services/{service_id},
     * specifying that usage from only this set of services should be
     * included in the budget. If omitted, the report will include
     * usage for all the services. The service names are available
     * through the Catalog API:
     * https://cloud.google.com/billing/v1/how-tos/catalog-api.
     * 
     */
    @Import(name="services")
    private @Nullable Output<List<String>> services;

    public Optional<Output<List<String>>> services() {
        return Optional.ofNullable(this.services);
    }

    /**
     * A set of subaccounts of the form billingAccounts/{account_id},
     * specifying that usage from only this set of subaccounts should
     * be included in the budget. If a subaccount is set to the name of
     * the parent account, usage from the parent account will be included.
     * If the field is omitted, the report will include usage from the parent
     * account and all subaccounts, if they exist.
     * 
     */
    @Import(name="subaccounts")
    private @Nullable Output<List<String>> subaccounts;

    public Optional<Output<List<String>>> subaccounts() {
        return Optional.ofNullable(this.subaccounts);
    }

    private BudgetBudgetFilterArgs() {}

    private BudgetBudgetFilterArgs(BudgetBudgetFilterArgs $) {
        this.creditTypes = $.creditTypes;
        this.creditTypesTreatment = $.creditTypesTreatment;
        this.labels = $.labels;
        this.projects = $.projects;
        this.services = $.services;
        this.subaccounts = $.subaccounts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BudgetBudgetFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BudgetBudgetFilterArgs $;

        public Builder() {
            $ = new BudgetBudgetFilterArgs();
        }

        public Builder(BudgetBudgetFilterArgs defaults) {
            $ = new BudgetBudgetFilterArgs(Objects.requireNonNull(defaults));
        }

        public Builder creditTypes(@Nullable Output<List<String>> creditTypes) {
            $.creditTypes = creditTypes;
            return this;
        }

        public Builder creditTypes(List<String> creditTypes) {
            return creditTypes(Output.of(creditTypes));
        }

        public Builder creditTypes(String... creditTypes) {
            return creditTypes(List.of(creditTypes));
        }

        public Builder creditTypesTreatment(@Nullable Output<String> creditTypesTreatment) {
            $.creditTypesTreatment = creditTypesTreatment;
            return this;
        }

        public Builder creditTypesTreatment(String creditTypesTreatment) {
            return creditTypesTreatment(Output.of(creditTypesTreatment));
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder projects(@Nullable Output<List<String>> projects) {
            $.projects = projects;
            return this;
        }

        public Builder projects(List<String> projects) {
            return projects(Output.of(projects));
        }

        public Builder projects(String... projects) {
            return projects(List.of(projects));
        }

        public Builder services(@Nullable Output<List<String>> services) {
            $.services = services;
            return this;
        }

        public Builder services(List<String> services) {
            return services(Output.of(services));
        }

        public Builder services(String... services) {
            return services(List.of(services));
        }

        public Builder subaccounts(@Nullable Output<List<String>> subaccounts) {
            $.subaccounts = subaccounts;
            return this;
        }

        public Builder subaccounts(List<String> subaccounts) {
            return subaccounts(Output.of(subaccounts));
        }

        public Builder subaccounts(String... subaccounts) {
            return subaccounts(List.of(subaccounts));
        }

        public BudgetBudgetFilterArgs build() {
            return $;
        }
    }

}
