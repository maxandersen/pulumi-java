// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.netapp.outputs;

import com.pulumi.azure.netapp.outputs.GetSnapshotPolicyDailySchedule;
import com.pulumi.azure.netapp.outputs.GetSnapshotPolicyHourlySchedule;
import com.pulumi.azure.netapp.outputs.GetSnapshotPolicyMonthlySchedule;
import com.pulumi.azure.netapp.outputs.GetSnapshotPolicyWeeklySchedule;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetSnapshotPolicyResult {
    /**
     * @return The name of the NetApp Account in which the NetApp Snapshot Policy was created.
     * 
     */
    private final String accountName;
    /**
     * @return Daily snapshot schedule.
     * 
     */
    private final List<GetSnapshotPolicyDailySchedule> dailySchedules;
    /**
     * @return Defines that the NetApp Snapshot Policy is enabled or not.
     * 
     */
    private final Boolean enabled;
    /**
     * @return Hourly snapshot schedule.
     * 
     */
    private final List<GetSnapshotPolicyHourlySchedule> hourlySchedules;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return Specifies the supported Azure location where the resource exists.
     * 
     */
    private final String location;
    /**
     * @return List of the days of the month when the snapshots will be created.
     * 
     */
    private final List<GetSnapshotPolicyMonthlySchedule> monthlySchedules;
    /**
     * @return The name of the NetApp Snapshot Policy.
     * 
     */
    private final String name;
    /**
     * @return The name of the resource group where the NetApp Snapshot Policy should be created.
     * 
     */
    private final String resourceGroupName;
    private final Map<String,String> tags;
    /**
     * @return Weekly snapshot schedule.
     * 
     */
    private final List<GetSnapshotPolicyWeeklySchedule> weeklySchedules;

    @CustomType.Constructor
    private GetSnapshotPolicyResult(
        @CustomType.Parameter("accountName") String accountName,
        @CustomType.Parameter("dailySchedules") List<GetSnapshotPolicyDailySchedule> dailySchedules,
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("hourlySchedules") List<GetSnapshotPolicyHourlySchedule> hourlySchedules,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("monthlySchedules") List<GetSnapshotPolicyMonthlySchedule> monthlySchedules,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("weeklySchedules") List<GetSnapshotPolicyWeeklySchedule> weeklySchedules) {
        this.accountName = accountName;
        this.dailySchedules = dailySchedules;
        this.enabled = enabled;
        this.hourlySchedules = hourlySchedules;
        this.id = id;
        this.location = location;
        this.monthlySchedules = monthlySchedules;
        this.name = name;
        this.resourceGroupName = resourceGroupName;
        this.tags = tags;
        this.weeklySchedules = weeklySchedules;
    }

    /**
     * @return The name of the NetApp Account in which the NetApp Snapshot Policy was created.
     * 
     */
    public String accountName() {
        return this.accountName;
    }
    /**
     * @return Daily snapshot schedule.
     * 
     */
    public List<GetSnapshotPolicyDailySchedule> dailySchedules() {
        return this.dailySchedules;
    }
    /**
     * @return Defines that the NetApp Snapshot Policy is enabled or not.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Hourly snapshot schedule.
     * 
     */
    public List<GetSnapshotPolicyHourlySchedule> hourlySchedules() {
        return this.hourlySchedules;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Specifies the supported Azure location where the resource exists.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return List of the days of the month when the snapshots will be created.
     * 
     */
    public List<GetSnapshotPolicyMonthlySchedule> monthlySchedules() {
        return this.monthlySchedules;
    }
    /**
     * @return The name of the NetApp Snapshot Policy.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The name of the resource group where the NetApp Snapshot Policy should be created.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return Weekly snapshot schedule.
     * 
     */
    public List<GetSnapshotPolicyWeeklySchedule> weeklySchedules() {
        return this.weeklySchedules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnapshotPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private List<GetSnapshotPolicyDailySchedule> dailySchedules;
        private Boolean enabled;
        private List<GetSnapshotPolicyHourlySchedule> hourlySchedules;
        private String id;
        private String location;
        private List<GetSnapshotPolicyMonthlySchedule> monthlySchedules;
        private String name;
        private String resourceGroupName;
        private Map<String,String> tags;
        private List<GetSnapshotPolicyWeeklySchedule> weeklySchedules;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSnapshotPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.dailySchedules = defaults.dailySchedules;
    	      this.enabled = defaults.enabled;
    	      this.hourlySchedules = defaults.hourlySchedules;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.monthlySchedules = defaults.monthlySchedules;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.weeklySchedules = defaults.weeklySchedules;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder dailySchedules(List<GetSnapshotPolicyDailySchedule> dailySchedules) {
            this.dailySchedules = Objects.requireNonNull(dailySchedules);
            return this;
        }
        public Builder dailySchedules(GetSnapshotPolicyDailySchedule... dailySchedules) {
            return dailySchedules(List.of(dailySchedules));
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder hourlySchedules(List<GetSnapshotPolicyHourlySchedule> hourlySchedules) {
            this.hourlySchedules = Objects.requireNonNull(hourlySchedules);
            return this;
        }
        public Builder hourlySchedules(GetSnapshotPolicyHourlySchedule... hourlySchedules) {
            return hourlySchedules(List.of(hourlySchedules));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder monthlySchedules(List<GetSnapshotPolicyMonthlySchedule> monthlySchedules) {
            this.monthlySchedules = Objects.requireNonNull(monthlySchedules);
            return this;
        }
        public Builder monthlySchedules(GetSnapshotPolicyMonthlySchedule... monthlySchedules) {
            return monthlySchedules(List.of(monthlySchedules));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder weeklySchedules(List<GetSnapshotPolicyWeeklySchedule> weeklySchedules) {
            this.weeklySchedules = Objects.requireNonNull(weeklySchedules);
            return this;
        }
        public Builder weeklySchedules(GetSnapshotPolicyWeeklySchedule... weeklySchedules) {
            return weeklySchedules(List.of(weeklySchedules));
        }        public GetSnapshotPolicyResult build() {
            return new GetSnapshotPolicyResult(accountName, dailySchedules, enabled, hourlySchedules, id, location, monthlySchedules, name, resourceGroupName, tags, weeklySchedules);
        }
    }
}
